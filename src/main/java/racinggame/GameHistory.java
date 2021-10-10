package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GameHistory {
	private List<List<Map<String, Integer>>> roundResults = new ArrayList<List<Map<String, Integer>>>();

	public List<List<Map<String, Integer>>> getRoundResults() {
		return roundResults;
	}

}
