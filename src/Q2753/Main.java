package Q2753;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		Year(year);
	}

	
	public static void Year(int year){
		if(year%4==0){
		if(year%100!=0) {
		System.out.print("1");
		}else if(year%400==0){
		System.out.print("1");
		}else {
		System.out.print("0");
			
		}
		}else {
		System.out.print("0");	
		}
	}
}
