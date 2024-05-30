package Q2908;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();   // 숫자 받기
		String b = sc.next();
		String[] x = a.split(""); //자리마다 배열로 저장
		String[] y = b.split("");
		int s = Integer.parseInt(x[2]);  //세번째자리의 수만 비교하면됨
		int d = Integer.parseInt(y[2]);	
		int ss = Integer.parseInt(x[1]);
		int dd = Integer.parseInt(y[1]);
		int sss= Integer.parseInt(x[0]);
		int ddd= Integer.parseInt(y[0]);
		if(s>d) {
			for(int i=2; i>=0;i--) {
				System.out.print(x[i]);
			}
		}else if(d>s) {
			for(int i=2; i>=0;i--) {
				System.out.print(y[i]);
			}
		}else if(d==s) {
			if(ss>dd) {
				for(int i=2; i>=0;i--) {
					System.out.print(x[i]);
				}
			}else if(dd>ss) {
				for(int i=2; i>=0;i--) {
					System.out.print(y[i]);
				}
			}else if(ss==dd) {
				if(sss>ddd) {
					for(int i=2; i>=0;i--) {
						System.out.print(y[i]);
					}
				}else if(ddd>sss) {
					for(int i=2; i>=0;i--) {
						System.out.print(y[i]);
					}
				}
			}
		}
	}

}
