package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액: ");
		int money = scanner.nextInt();
		int temp;
		
		for (int n = 0; n < MONEYS.length; n++) {
			System.out.println(MONEYS[n] + "원 : " + money/MONEYS[n] + "개");
			temp = money/MONEYS[n];
			money = money - MONEYS[n] * temp;
		}
		scanner.close();
	}

}
