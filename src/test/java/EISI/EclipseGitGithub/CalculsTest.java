package p2;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import p1.Calculs;

public class CalculsTest {

//	@Test
//	void testMultiplier() {
//		fail("Not yet implemented");
//	}

	@Test
	void testAdditionner() {

		// Arrange
		int a = 2;
		int b = 3;
		Calculs calcul = new Calculs(a, b);

		// Act
		int resultat = calcul.additionner();

		// Assert
		assertEquals(5, resultat);
	}

	@Test
	void TestMultiplier() {

		// Arrange
		int a = 12;
		int b = 3;
		Calculs calcul = new Calculs(a, b);

		// Act
		int resultat = calcul.multiplier();

		// Assert
		assertEquals(36, resultat);
	}

	@Test
	void TestDiviser() {

		// Arrange
		int a = 12;
		int b = 3;
		Calculs calcul = new Calculs(a, b);

		// Act
		int resultat = calcul.diviser();

		// Assert
		assertEquals(4, resultat);
	}

	@Test
	void TestSoustraire() {

		// Arrange
		int a = 8;
		int b = 3;
		Calculs calcul = new Calculs(a, b);

		// Act
		int resultat = calcul.soustraire();

		// Assert
		assertEquals(5, resultat);
	}

}
