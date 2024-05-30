package Q11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.nextLine();
		String a = sc.nextLine();
		String[] b= a.split("");
		for(int i=0;i<n;i++) {
			int c=Integer.parseInt(b[i]);
			sum+=c;
		}
		System.out.print(sum);
	}

}
