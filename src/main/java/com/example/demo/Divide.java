package com.example.demo;

public class Divide {
	public static void main(String[] args) {
		int dividend = 99; // số chia
		int divisor = 0; // số bị chia
		System.out.println("Dividend: " + dividend + " Divisor: " + divisor);
		if (divisor == 0) {
			System.out.println("Can't divide by 0");
			return;
		}
		// Xác định dấu của kết quả
		if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0))
			System.out.println("Ket qua phep tinh: " + Calc(dividend, divisor));
		else
			System.out.println("Ket qua phep tinh: " + -Calc(dividend, divisor));
	}

	// Chuyển số âm thành số dương và thực hiện phép chia bằng cách cộng dồn
	public static int Calc(int dividend, int divisor) {
		// Chuyển số âm thành số dương
		if (dividend < 0)
			dividend = -dividend;
		if (divisor < 0)
			divisor = -divisor;
		// Biến lưu trữ giá trị divisor cộng dồn
		int d = divisor;
		int count = 0;
		// Trường hợp divisor lớn hơn dividend
		if (divisor > dividend) {
			return count;
		}
		// Cộng dồn divisor cho đến khi vượt quá dividend
		while (d <= dividend) {
			count++;
			d += divisor;
		}
		return count;
	}
}
