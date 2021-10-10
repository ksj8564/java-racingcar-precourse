package racinggame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CarTest {
	
	@Test
	void 자동차_이름_입력() {
		assertEquals(new Game("1,2,3").getCarNameList(), Arrays.asList("1", "2", "3"));		
	}

}
