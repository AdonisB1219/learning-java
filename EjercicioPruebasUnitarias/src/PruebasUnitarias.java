import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebasUnitarias {
	FormulaGeneral f = new FormulaGeneral();

	@Test
	void test() {
			assertEquals(3, f.resolver(1, -5, 6, 1));
			assertEquals(2, f.resolver(1, -5, 6, 2));
			
			assertEquals(2, f.resolver(-1, 7, -10, 1));
			assertEquals(5, f.resolver(-1, 7, -10, 2));
			
			assertEquals(4, f.resolver(2, -14, 24, 1));
			assertEquals(3, f.resolver(2, -14, 24, 2));
			
			assertEquals(1, f.resolver(1, 3, -4, 1));
			assertEquals(-4, f.resolver(1, 3, -4, 2));
			
			assertEquals(9, f.resolver(1, -7, -18, 1));
			assertEquals(-2, f.resolver(1, -7, -18, 2));




	}

}
