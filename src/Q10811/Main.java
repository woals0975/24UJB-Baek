package Q10811;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 바구니수
		int x = sc.nextInt();//돌리는 횟수
		int[] s = new int[n];
		int l = 1;
		for(int i=0;i<n;i++,l++) {  //바구니에 순서대로 번호넣기   바구니(1,2,3,4,5) 상태
			s[i]=l;
		}
		int[] back = Arrays.copyOf(s, s.length);
		for(int j=0; j<x;j++) {  //x번 뒤집기
		int f = sc.nextInt(); // 처음수
		int la = sc.nextInt();// 마지막수
		int q = la-f; //
		for(int k=f-1;k<la;k++,q=q-2) {
			s[k] =back[k+(q)];
		}
		back = Arrays.copyOf(s, s.length);
		}
	for(int i=0;i<s.length;i++) {
		System.out.print(s[i]+" ");
	}
 }
}