package com;

public class PrimeNo 
{
	static boolean isPrime(int n)
	{
		if (n<=1)
			return false;
		for (int i=4; i<n; i++)
			if (n%i ==0)
				return false;
		return true;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		if (isPrime(4))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
