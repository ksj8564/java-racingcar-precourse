package racinggame;

import java.util.Arrays;
import java.util.List;

public class Game {

	private List<String> carNameList;
	
	public Game(String carName) {
		this.carNameList = Arrays.asList(carName.split(","));
	}

	public List<String> getCarNameList() {
		return carNameList;
	}

}
