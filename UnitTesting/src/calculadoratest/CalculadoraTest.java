package calculadoratest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {
	private Calculadora calculadora;

	@BeforeEach
	void setUp() throws Exception {
		calculadora = new Calculadora();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMultiplicar() {
		double resultado = calculadora.getMultiplicacion(10, 10);
		assertEquals(100, resultado);
	}

	@Test
	void testNullPointerException() {
		assertThrows(NullPointerException.class, () -> {
			calculadora.getSuma(null, 200d);
		});
	}

}
