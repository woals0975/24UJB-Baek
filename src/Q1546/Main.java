package Q1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();   //과목수
		double sum=0;
		double max = 0;
		double each = 0;
		int[] a = new int [n];// 점수 들어가는 배열
		for(int i=0; i<n;i++) { 
		int b= sc.nextInt();
		a[i]= b;
		if(i==0) {
			max=a[i];
		}else if(a[i]>max) {
			max=a[i];
		}		
		}
		
		for(int j=0; j<n;j++) {
			each= (a[j]/max)*100;
			sum+=each;
		}
		System.out.print(sum/n);
}
}

