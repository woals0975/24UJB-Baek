package Q2440;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = input; j > 0; j--) {  //똑같이하고 N-i하면 되네.. 왜 이렇게 돌려서 했을까
				if (j >= i) {
					System.out.print("*");
//				}else {
//					System.out.print(" "); // 문제에 공백 넣으라는 말없다..
//				}
				}
				if (j == 1) {
					System.out.println();

				}
			}
		}
		sc.close();
	}
}
