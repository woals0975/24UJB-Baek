package Q3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i =0; i<10;i++) {
			int in = sc.nextInt();
			int in2 = in%42; //42로 나눔
			a[i] = in2; //42로 나눈 나머지들의 배열
		}
		sc.close();
		int b[] = Arrays.stream(a).distinct().toArray(); //배열의 중복 제거
		System.out.print(b.length);
		
	}
}
