package Q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] c = a.toCharArray();
		int[] z = new int[3];

		for (int i = 0; i < c.length; i++) {
			Character.getNumericValue(c[i]);
			z[i] = c[i] - 48; // z가 위의 세자리 배열
		}
		String b = sc.next();
		sc.close();
		char[] d = b.toCharArray();
		int[] x = new int[3];
		for (int i = 0; i < c.length; i++) {
			Character.getNumericValue(d[i]);
			x[i] = d[i] - 48; // z가 위의 세자리 배열
		}

		int sum3 = 0;
		int sum2 = 0;
		int sum1 = 0;
		int sum = 0;
		for (int j = 2; j >= 0; j--) {
			for (int i = 2; i >= 0; i--) {
				if (i == 2 && j == 2) {
					sum3 = z[2] * d[2];
				} else if (i == 1 && j == 2) {
					sum3 = z[1] * d[2]*10 ;
				} else if (i == 0 && j == 2) {
					sum3 = z[0] * d[2]*100 ;
				} else if (i == 2 && j == 1) {
					sum2 = z[2] * d[1]*10 ;
				} else if (i == 1 && j == 1) {
					sum2 = z[1] * d[1]*100 ;
				} else if (i == 0 && j == 1) {
					sum2 = z[0] * d[1]*1000 ;
				} else if (i == 2 && j == 0) {
					sum1 = z[2] * d[0]*100 ;
				} else if (i == 1 && j == 0) {
					sum1 = z[1] * d[0]*1000 ;
				} else if (i == 0 && j == 0) {
					sum1 = z[0] * d[0]*10000 ;
					sum = sum1*100 + sum2*10 + sum3;
					System.out.println(sum3);
					System.out.println(sum2);
					System.out.println(sum1);
					System.out.println(sum);
					break;
				}
			}

		}
	}
}
		    
			


asdasd