package racinggame;

public class Car {
	
	private static final int VALID_NAME_LENGTH = 5;

	private String name;
	

	public Car(String name) throws IllegalArgumentException{
		if (name.length() > VALID_NAME_LENGTH) {
			throw new IllegalArgumentException("[ERROR] 차량명은 5글자를 초과할 수 없습니다.");
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
