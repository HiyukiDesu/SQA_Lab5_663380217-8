package sqa.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEquivalence {
	
	Income test = new Income();
	
	@ParameterizedTest
	@CsvSource({
	    "3000, 550, 1500, 76500",
	    "3000, 550, 250, -1",
	    "3000, 550, 3250, -1",
	    "3000, 50, 1500, -1",
	    "3000, 50, 250, -1",
	    "3000, 50, 3250, -1",
	    "3000, 1050, 1500, -1",
	    "3000, 1050, 250, -1",
	    "3000, 1050, 3250, -1",
	    "500, 550, 1500, -1",
	    "500, 550, 250, -1",
	    "500, 550, 3250, -1",
	    "500, 50, 1500, -1",
	    "500, 50, 250, -1",
	    "500, 50, 3250, -1",
	    "500, 1050, 1500, -1",
	    "500, 1050, 250, -1",
	    "500, 1050, 3250, -1",
	    "6000, 550, 1500, -1",
	    "6000, 550, 250, -1",
	    "6000, 550, 3250, -1",
	    "6000, 50, 1500, -1",
	    "6000, 50, 250, -1",
	    "6000, 50, 3250, -1",
	    "6000, 1050, 1500, -1",
	    "6000, 1050, 250, -1",
	    "6000, 1050, 3250, -1"
	})
	void test_strong_robust_equivalence(int blade, int motor, int grille, Double expected) {
		assertEquals(expected, test.calculateIncome(blade, motor, grille));
	}

}