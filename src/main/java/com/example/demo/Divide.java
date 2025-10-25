package com.example.demo;

public class Divide {
	public static void main(String[] args) {
		int dividend = -97; // dividend
		int divisor = -3; // divisor
		System.out.println("Dividend: " + dividend + " Divisor: " + divisor);
		if (divisor == 0) {
			System.out.println("Can't divide by 0");
			return;
		}
		// If both numbers have the same sign, the result is positive
		if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0))
			System.out.println("Ket qua phep tinh: " + Calc(dividend, divisor));
		else
			System.out.println("Ket qua phep tinh: " + -Calc(dividend, divisor));
	}

	// Compute division using repeated subtraction
	public static int Calc(int dividend, int divisor) {
		// Ensure both numbers are positive
		if (dividend < 0)
			dividend = -dividend;
		if (divisor < 0)
			divisor = -divisor;
		// Initialize variables
		int d = divisor;
		int count = 0;
		// If divisor is greater than dividend, return 0
		if (divisor > dividend) {
			return count;
		}
		// Repeatedly subtract divisor from dividend
		while (d <= dividend) {
			count++;
			d += divisor;
		}
		return count;
	}
}
