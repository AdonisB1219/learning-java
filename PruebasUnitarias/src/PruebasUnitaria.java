import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class PruebasUnitaria {

	Calculator cal = new Calculator();
	
	@Test
	@Order(4)
	@DisplayName ("Capturar una Excepción ArithmeticException")
	void pruebaException() {
		assertEquals(3, cal.divide(9,3));
		assertEquals(3, cal.divide(27,9));
		Exception e = assertThrows(ArithmeticException.class, ()->cal.divide(10, 0));
		assertEquals("/ by zero", e.getMessage());

	}
	
	@Test
	@DisplayName ("Prueba de que str PI no sea nulo")
	void pruebaString() {
		assertNotNull(cal.getStrPI());
	}
	
	@Test
	@DisplayName ("Prueba de la suma de dos números enteros en varias operaciones")
	void pruebaSumaEnterosVarios() {
		assertAll("Sumas",
				()-> assertEquals(256, cal.suma(128,128)),
				()-> assertEquals(500, cal.suma(250,250)),
				()-> assertEquals(1025, cal.suma(1000,25 )),
				()-> assertEquals(950, cal.suma(800,150))

						
						);
	}
	
	
	@Test
	@DisplayName ("Prueba de resultado true")
	void pruebaBooleana() {
		System.out.println("Pruba booleana");
		assertTrue(cal.getPI() >= 3.14);
		assertTrue(cal.getPI() <= 3.1416);
	}
	@Test
	@DisplayName ("Prueba de la multiplicación de dos números enteros")
	void pruebaSumaEnteros() {
		assertEquals(20, cal.multiplica(4, 5));
		assertEquals((448*4), cal.multiplica(448, 4));
		assertEquals(20, cal.multiplica(4, 5));


	}

}
