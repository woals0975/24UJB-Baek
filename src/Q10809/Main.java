package Q10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] in2 = in.split("");
		int[] z = new int [in2.length]; 
		for(int i=0;i<in2.length;i++) {
			
		}
		
		int[] a = new int[26];
		int num = 97;// 대문자 65 소문자 97
		for(int i=0; i<26;i++,num++) {
			a[i] =num;
	}
		char[] c = new char[a.length];
		for(int i=0; i<26;i++,num++) {
			c[i] =(char)a[i];
			for(int j=0;j<in2.length;j++) {
				if(c[i]==in2[i]) {
					
				}
			}
			
	}
		
		
		
		

}
}
