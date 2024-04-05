package Q1330;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		comparison(a,b);
	}

	


	public static void comparison(int a ,int b) {
		if(a>b) {
			System.out.println(">");
		}else if(b>a) {
			System.out.println("<");
		}else if(a==b) {
			System.out.println("=");
		}
		
	}
	
}