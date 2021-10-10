package racinggame;

public class Util {
	public static boolean isOnlyNum(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

}
