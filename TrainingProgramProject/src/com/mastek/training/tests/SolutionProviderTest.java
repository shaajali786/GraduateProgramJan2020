package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.basics.SolutionProvider;

class SolutionProviderTest {

	@Test
	void testGetMaxNumberValidParams() {
		// assert<condition>(<expectied-result>,<call the function for actual result>,
		//					<message to display if the expected result does not match actual result?>);
		assertEquals(10,SolutionProvider.getMaxNumber(10, 2),"Invalid Max Number Returned"); 
	}
	
	@Test
	void testGetMaxNumberEqualParams() {
		assertEquals(9,SolutionProvider.getMaxNumber(9, 9),"Invalid Max Number Returned");
	}
	
	@Test
	void testGetMaxNumberNegativeValueParams() {
		assertEquals(-2,SolutionProvider.getMaxNumber(-110, -2),"Invalid Max Number Returned");
	}
	
	@Test
	void testGetMaxNumberMaxLimitsForIntParams() {
		assertEquals(999999999,SolutionProvider.getMaxNumber(999999999, 2),"Invalid Max Number Returned");
	}

	@Test
	void testDivideNumber() {
		assertEquals("3,0",SolutionProvider.divideNumber(6, 2),"Invalid quotion value returned");
	}
	
	@Test
	void testkmToMiles() {
		assertEquals(1,SolutionProvider.kmToMiles(1.608),"Invalid remainder value returned");
	}
	@Test
	void testareaOfARectangles() {
		assertEquals(4,SolutionProvider.areaOfARectangle(2,2),"Invalid remainder value returned");
	}
	@Test
	void testdistSpeedJourney() {
		assertEquals(32,SolutionProvider.distSpeedJourney(16.0,2.0),"Invalid remainder value returned");
	}
	@Test
	void testareaOfACircle() {
		assertEquals(12.56,SolutionProvider.areaOfACircle(2.0),"Invalid remainder value returned");
	}

} 	