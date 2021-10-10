package racinggame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

	private Game game;

	@BeforeEach
	void beforeEach() {
		game = new Game("Ray,Benz,Tico");
	}

	@Test
	void 자동차_이름_입력() {
		assertEquals(game.getCarList().get(0).getName(), "Ray");
		assertEquals(game.getCarList().get(1).getName(), "Benz");
		assertThrows(IllegalArgumentException.class, () -> {
			game = new Game("Ray,Benz,Tucson");
		});

	}

	@Test
	void 자동차_전진_테스트() {
		assertEquals(game.isMoveForward(4), true);
		assertEquals(game.isMoveForward(3), false);
	}

}
