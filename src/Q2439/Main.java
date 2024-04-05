package Q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();	
		for (int i = 1; i <= a; i++) { // За ---------
			for (int j = a; j >= 1; j--) {// ї­|||||||||
				if(i>=j) {
						System.out.print("*");
						}else{
						System.out.print(" ");
						}
				
				if (j==1 && i <= a) {
					System.out.print("\n");

				}
			}
			}
		}
	}

