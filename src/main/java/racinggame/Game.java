package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<Car> carList = new ArrayList<Car>();

	public Game(String carNames) throws IllegalArgumentException{
		String[] carNameArr = carNames.split(",");
		for (int i = 0; i < carNameArr.length; i++) {
			this.carList.add(new Car(carNameArr[i]));
		}
	}

	public List<Car> getCarList() {
		return carList;
	}
	

	public boolean isMoveForward(int i) {
		if(i>=4) {
			return true;
		}
		return false;
	}

	public String getWinner(List<Car> carList) {
		int winMoveDistance = getWinDistance(carList);
		
		StringBuilder winner = new StringBuilder();		
		for(Car car : carList) {
			if(winMoveDistance == car.getMoveDistance()) {
				winner.append(",");
				winner.append(car.getName());
			}
		}		
		return winner.toString().substring(1);
	}

	private int getWinDistance(List<Car> carList) {
		int winMoveDistance = 0;
		for(Car car : carList) {
			if(car.getMoveDistance() > winMoveDistance) {
				winMoveDistance = car.getMoveDistance();
			}
		}
		return winMoveDistance;
	}	
}
