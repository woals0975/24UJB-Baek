package Q25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt(); //����
		int kind = sc.nextInt();  //����
		int ok = 0;
		for(int i=0; i<kind;i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			ok+= price*num;
		}
		if(sum==ok) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}
