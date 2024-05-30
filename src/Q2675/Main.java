package Q2675;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n ; i++) {
			int r = sc.nextInt();   //반복수
			String w = sc.next();  //문자열 공백구분이니까 next사용
			String[] wa = w.split(""); 
			for(int j=0; j<wa.length;j++) {  //문자열을 순환
				for(int k=0;k<r;k++) { 		//문자열을 반복수만큼 반복
					System.out.print(wa[j]);
				}
			}
			System.out.println(); //위에 프린트니까 한번 내려줘야함
		}
	}

}
