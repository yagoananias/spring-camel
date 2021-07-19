package com.brq.camel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstTest {
	
	@Test
	void firstSucessTest() {
		
		int sum = 5 + 2;
		int expected = 7;
		
		assertEquals(expected, sum);
	}
	@Test
	void firstIfExpectedGreatherThanSumTest() {
		int sum = 5 + 3;
		int expected = 8;
		
		assertTrue(expected > sum);
	}

}
