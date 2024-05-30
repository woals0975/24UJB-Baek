package Q2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1; // 현재 몇번째인가
		int cnt2 = 0; //최대값은 몇번째인가
		int max = Integer.MIN_VALUE;
		for(int i=0; i<9;i++,cnt++) {
			int a = sc.nextInt();
			if(max<a) {
				max=a;
				cnt2 = cnt;
			}else {
				
			}
		}
		System.out.println(max);
		System.out.print(cnt2);
		
	}

}
