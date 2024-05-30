package Q1152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		String tin = in.trim();  //앞뒤 공백제거
		String[] a = tin.split(" ");
		System.out.print(a.length);
		
	}

}
