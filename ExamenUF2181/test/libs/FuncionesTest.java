package libs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesTest {
	private static Funciones funciones;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando tests...");
		funciones = new Funciones();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Test finalizados.");
	}

	@Test
	void testDevuelveCentral() {
		assertEquals(2, funciones.devuelveCentral(1, 2, 3));
		assertEquals(2, funciones.devuelveCentral(1, 3, 2));
		assertEquals(2, funciones.devuelveCentral(2, 1, 3));
		assertEquals(2, funciones.devuelveCentral(2, 3, 1));
		assertEquals(2, funciones.devuelveCentral(3, 1, 2));
		assertEquals(2, funciones.devuelveCentral(3, 2, 1));
		assertEquals(0, funciones.devuelveCentral(0, 0, 0));
		assertEquals(2, funciones.devuelveCentral(2, 2, 2));
		assertEquals(-1, funciones.devuelveCentral(-1, 3, -2));
		assertEquals(-2, funciones.devuelveCentral(-1, -3, -2));
	}

	@Test
	void testMinutosEntre() {
		assertEquals(130, funciones.minutosEntre(12,20,14,30));
		assertEquals(130, funciones.minutosEntre(14,30,12,20));
		assertEquals(1439, funciones.minutosEntre(23,59,0,0));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(32,10,14,20));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(22,70,14,20));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(22,10,95,20));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(22,10,14,75));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(-10,10,14,20));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(22,-22,14,20));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(22,10,-9,20));
		assertThrows(ArithmeticException.class, 
				() -> funciones.minutosEntre(22,10,14,-28));
	}

	@Test
	void testEsCapicua() {
		int v1[] = {8,16,15,10};
		int v2[] = {-8,0,0,-8};
		int v3[] = {0,0,0,0,0};
		int v4[] = {-3,-4,-4,-3};
		int v5[] = {1,2,3,2,1};
		
		assertFalse(funciones.esCapicua(v1), "Error en el testeo: el vector es capicúa.");
		assertTrue(funciones.esCapicua(v2), "Error en el testeo: el vector no es capicúa.");
		assertTrue(funciones.esCapicua(v3), "Error en el testeo: el vector no es capicúa.");
		assertTrue(funciones.esCapicua(v4), "Error en el testeo: el vector no es capicúa.");
		assertTrue(funciones.esCapicua(v5), "Error en el testeo: el vector no es capicúa.");
	}

	@Test
	void testSuma_vectores() {
		int v1exc[] = {1,2,3,4,5};
		int v2exc[] = {1,2,3,4};
		int v1[] = {8,16,15,10};
		int v2[] = {-8,0,60,12};
		int v3[] = {0,0,0,0};
		int v4[] = {-3,-4,8,-9};
		int v5[] = {-8,-16,-15,-10};
		int res1[] = {0,16,75,22};
		int res2[] = {8,16,15,10};
		int res3[] = {-11,-4,68,3};
		int res4[] = {-11,-20,-7,-19};
		int res5[] = {0,0,0,0};
		
		
		
		assertThrows(ArithmeticException.class, 
				()-> funciones.suma_vectores(v1exc, v2exc), "Error en el testeo: los vectores han de tener la misma longitud.");
		assertArrayEquals(res1,funciones.suma_vectores(v1, v2), "Error en el testeo: la suma no se ha realizado correctamente.");
		assertArrayEquals(res2,funciones.suma_vectores(v1, v3), "Error en el testeo: la suma no se ha realizado correctamente.");
		assertArrayEquals(res3,funciones.suma_vectores(v2, v4), "Error en el testeo: la suma no se ha realizado correctamente.");
		assertArrayEquals(res4,funciones.suma_vectores(v4, v5), "Error en el testeo: la suma no se ha realizado correctamente.");
		assertArrayEquals(res5,funciones.suma_vectores(v1, v5), "Error en el testeo: la suma no se ha realizado correctamente.");
		assertArrayEquals(res5,funciones.suma_vectores(v3, v3), "Error en el testeo: la suma no se ha realizado correctamente.");
		
	}
}
