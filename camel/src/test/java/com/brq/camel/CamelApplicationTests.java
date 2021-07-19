package com.brq.camel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CamelApplicationTests {

	@Test
	void firstSucessTest() {
		int sum = 5 + 2;
		int expected = 7;			
		
		assertEquals(expected, sum);
		}

}
