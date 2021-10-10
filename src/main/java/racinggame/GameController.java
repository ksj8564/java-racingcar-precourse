package racinggame;

public class GameController {

	public static void run() {
		boolean isEnd = false;
		do {
			try {
				doGame();
				isEnd = true;
			} catch (IllegalArgumentException e) {
				OutputView.printError(e.getMessage());
			}
		} while (!isEnd);
	}

	private static void doGame() throws IllegalArgumentException {
		OutputView.printCarNameInstruction();
		Game game = new Game(InputView.getInput());
		OutputView.printAttemptCountInstruction();
		String round = InputView.getInput();
		game.setRound(round);
		game.race();
		GameHistory gameHistory = game.getGameHistory();
		OutputView.printExcuteResultInstruction();
		for (int i = 0; i < gameHistory.getRoundResults().size(); i++) {
			OutputView.printRoundResult(gameHistory.getRoundResults().get(i));
		}
		OutputView.printWinner(game.getWinner(game.getCarList()));
	}

}
