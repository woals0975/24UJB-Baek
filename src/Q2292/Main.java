package Q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		sc.close();
		int b = 1;
		while(true) {
			for(int i=1;i<Integer.MAX_VALUE;i++) {
				b=b+(6*(i-1));
				if(b>=a) {
					System.out.print(i);
					return;
				}
			}
			
		}

	}
}
