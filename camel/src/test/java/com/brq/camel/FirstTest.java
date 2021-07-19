package com.brq.camel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FirstTest {
	
	@Test
	public void firstSucessTest() {
		
		int sum = 5 + 2;
		int expected = 7;
		
		assertEquals(expected, sum);
	}
	@Test
	public void firstIfExpectedGreatherThanSumTest() {
		int sum = 5 + 3;
		int expected = 7;
		
		assertTrue(expected > sum);
	}

}
