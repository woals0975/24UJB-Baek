package Q2440;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = input; j > 0; j--) {  //�Ȱ����ϰ� N-i�ϸ� �ǳ�.. �� �̷��� ������ ������
				if (j >= i) {
					System.out.print("*");
//				}else {
//					System.out.print(" "); // ������ ���� ������� ������..
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
