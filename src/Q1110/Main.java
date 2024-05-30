package Q1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		int cycle = 0;
		int o = in;
		for (;;) {
				int b = (in / 10) + (in % 10);
				if (b >= 10) {
					b = b % 10;
				}
				in = (in % 10) * 10 + b;
				cycle++;
				if (o == in) {
					break;
				}

			}
		System.out.print(cycle);
		}
		
	}


