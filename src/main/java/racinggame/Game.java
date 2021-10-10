package racinggame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nextstep.utils.Randoms;

public class Game {

	private static final int MIN_MOVING_FORWARD_NUMBER = 4;

	private List<Car> carList = new ArrayList<Car>();
	private GameHistory gameHistory = new GameHistory();
	private int round;

	public Game(String carNames) throws IllegalArgumentException {

		String[] carNameArr = carNames.split(",");
		if (Util.isExistDuplItem(carNameArr)) {
			throw new IllegalArgumentException("중복된 차량이 존재합니다.");
		}
		for (int i = 0; i < carNameArr.length; i++) {
			this.carList.add(new Car(carNameArr[i]));
		}
	}

	public void setRound(String round) {
		if (!Util.isOnlyNum(round)) {
			throw new IllegalArgumentException("시도 회수는 숫자로 입력해야 합니다.");
		}
		setRound(Integer.parseInt(round));
	}

	public void setRound(int round) {
		if (round <= 0) {
			throw new IllegalArgumentException("시도 회수는 0이나 음수가 될 수 없습니다.");
		}
		this.round = round;
	}

	public int getRound() {
		return round;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public GameHistory getGameHistory() {
		return gameHistory;
	}

	public boolean isMoveForward(int i) {
		if (i >= MIN_MOVING_FORWARD_NUMBER) {
			return true;
		}
		return false;
	}

	public void race() {
		for (int i = 0; i < round; i++) {
			playRound(i + 1);
		}
	}

	private void playRound(int round) {
		List<Map<String, Integer>> roundResult = new ArrayList<Map<String, Integer>>();
		for (Car car : carList) {
			if (this.isMoveForward(Randoms.pickNumberInRange(0, 9))) {
				car.moveForward();
			}
			roundResult.add(new HashMap<String, Integer>() {
				{
					put(car.getName(), car.getMoveDistance());
				}
			});
		}
		gameHistory.getRoundResults().add(roundResult);
	}

	public String getWinner(List<Car> carList) {
		int winMoveDistance = getWinDistance(carList);

		StringBuilder winner = new StringBuilder();
		for (Car car : carList) {
			if (winMoveDistance == car.getMoveDistance()) {
				winner.append(",");
				winner.append(car.getName());
			}
		}
		return winner.toString().substring(1);
	}

	private int getWinDistance(List<Car> carList) {
		int winMoveDistance = 0;
		for (Car car : carList) {
			if (car.getMoveDistance() > winMoveDistance) {
				winMoveDistance = car.getMoveDistance();
			}
		}
		return winMoveDistance;
	}
}
