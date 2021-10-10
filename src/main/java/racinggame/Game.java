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
}
