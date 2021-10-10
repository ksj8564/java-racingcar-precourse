package racinggame;

import java.util.Arrays;
import java.util.HashSet;

public class Util {
	public static boolean isOnlyNum(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isExistDuplItem(String[] carNameArr) {
		if (carNameArr.length != new HashSet<String>(Arrays.asList(carNameArr)).size()) {
			return true;
		}
		return false;
	}

}
