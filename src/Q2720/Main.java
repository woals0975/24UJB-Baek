package Q2720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); //케이스 개수
		
		for(int i=0; i<c; i++) {
		int a = sc.nextInt(); //거스름돈 ex124면  1.24달러
		int x = a/25; // 쿼터 개수 
		if(x>0) {
			a= a-x*25;
		}
		int y = a/10; // 다임 개수
		if(y>0) {
			a=a-y*10;
		}
		int z = a/5;  //니켈 개수
		if(z>0) {
			a=a-z*5;
		}
		int l = a/1;  //페니 개수
		if(l>0) {
			a=a-l;
		}
		System.out.printf("%d %d %d %d \n",x,y,z,l);
		}
	}

}
