package tut4p;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
	
	@Test
	public void testAdd() {
		assertEquals(6, new Calc().add());
	}
	
	@Test
	public void testSubtract() {
		assertEquals(2, new Calc().subtract());
	}
}
