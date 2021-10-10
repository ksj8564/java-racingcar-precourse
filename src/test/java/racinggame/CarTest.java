package racinggame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void 자동차_이름_입력() {
		assertEquals(new Game("avante,sonata,bmw").getCarList().get(0).getName(), "avante");
		assertEquals(new Game("avante,sonata,bmw").getCarList().get(1).getName(), "sonata");
	}
}
