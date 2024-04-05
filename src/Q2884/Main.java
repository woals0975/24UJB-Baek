package Q2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), M = sc.nextInt();
		sc.close();
		if ((M - 45) < 0) {
			H = H - 1;
			M = M + 15;
		} else if ((M - 45) >= 0) {
			M = M - 45;
		}
		if (H == -1) {
			H = 23;
		}
		System.out.print(H + " " + M);

	}
}
