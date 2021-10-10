package racinggame;

public class GameController {
	public static void run() {
		OutputView.printCarNameInstruction();	
		String carNames = InputView.getInput();
		OutputView.printAttemptCountInstruction();	
		String round = InputView.getInput();		
		Game game = new Game(carNames, round);
		game.race();
		GameResult gameResult = game.getGameResult();
		OutputView.printExcuteResultInstruction();
		for(int i=0;i<gameResult.getRoundResults().size();i++) {
			OutputView.printRoundResult(gameResult.getRoundResults().get(i));			
		}	
		OutputView.printWinner(game.getWinner(game.getCarList()));		
	}
}
