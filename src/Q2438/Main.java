package Q2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		for (int i = 1; i <= a; i++) { // За ---------
			for (int j = 1; j <= i; j++) {// ї­|||||||||
				System.out.print("*");
				if (i == j && i < a) {
					System.out.print("\n");

				}

			}
		}
	}

}
