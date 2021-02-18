import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook g1;

	@BeforeEach
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
	}

	@AfterEach
	public void tearDown() throws Exception {
		g1 = null;
	}

	@Test  
	public void testAddScore() {
		assertEquals(2.0, g1.getScoreSize(), 0.01);
		
	}

	@Test
	public void testSum() {
		assertEquals(125,g1.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(75.0, g1.finalScore(), .0001);
	}

}
