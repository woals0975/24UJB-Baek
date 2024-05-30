package Q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); // 반복횟수
		int[] bas = new int[a]; // 바구니 사이즈
		for(int i=0;i<a;i++) { // 모든 바구니에 0을 넣는다.
			bas[i]=0;
		}
		outer:
		for(int i=0; i<b;i++) {
			int com1=sc.nextInt();	//시작
			int com2=sc.nextInt(); //끝
			int com3=sc.nextInt(); //공번호
			for(int j=com1-1;j<com2;j++) {
				bas[j]=com3;
			}
			if(i==b-1) {
				for(i=0;i<a;i++) {
					sc.close();
					System.out.print(bas[i]+" ");
					if(i==a-1) {
						break outer;	//없으면 끝나고 한번더 위로 올라가서 예외종료뜸
					}
				}
			}
		}
	}

}
