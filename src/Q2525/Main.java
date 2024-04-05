package Q2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H =sc.nextInt();
		int M =sc.nextInt();
		int C =sc.nextInt();
		sc.close();
		oven(H,M,C);
	}

	public static void oven(int H,int M,int C) {
		int a= M+C;
		if(a>=60) {
			H=H+((a)/60);  // 시간 더하기
			a=a%60; // 분 더하기	
		}
		if(H>=24) {
			H=H-24;
		}
		System.out.printf("%d %d",H,a);
		
	}
}
