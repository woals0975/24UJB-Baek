package Q2739;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		multiply(a);
	}

	
	public static void multiply(int a) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",a,i,a*i);
		}
		
	}
}
