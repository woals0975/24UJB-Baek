package Q10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testn =sc.nextInt();
	test(testn);
		
	}
	public static void test(int testn) {
	Scanner sc = new Scanner(System.in);
	int[] suma = new int[testn];
	int[] sumb = new int[testn];
	for(int i=0; i<testn; i++) {
		int a =sc.nextInt();
		int b =sc.nextInt();
		suma[i]+=a;
		sumb[i]+=b;
		if(i==testn-1) {
			sc.close();
			for(int j=0; j<testn-1;j++) {
				System.out.printf("%d",suma[j]+sumb[j]);
			}
		}
	
	
	}
}
}
