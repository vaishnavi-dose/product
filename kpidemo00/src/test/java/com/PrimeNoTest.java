package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeNoTest 
{
	@Test
	public void evaluateExpression() {
		PrimeNo p= new PrimeNo();
		boolean sol = p.isPrime(4);
		assertEquals(true, sol);
	}
}
