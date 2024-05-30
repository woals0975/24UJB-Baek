package Q9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String in = sc.nextLine();
			String[] out = in.split("");
			if(out.length==1) {
				System.out.println(out[0]+out[0]);
			}else {
				System.out.println(out[0]+out[out.length-1]);
			}
		}
	}

}
