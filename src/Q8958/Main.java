package Q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cn = sc.nextInt();
		String o = "O";
		String x = "X";
		int cnt =0; //O의 개수
		int score = 0;
		
		outer:
		for(int i=0;i<cn;i++) {
		String ox = sc.next();
		String[] ox2 = ox.split("");
		int b = 0;
		int n = 1; //다음꺼
			in:
				for(int j=0;j<ox2.length;j++) {
				
				for(; ;) {
					
				if(ox2[j].equals(o)) {
					cnt++;
					if(j==ox2.length-1) {
						score++;
						
					}
				}else {
					continue in;
					}
					my:
					for(; ;) {
						if((j+n)==ox2.length) {
							score+=b+cnt;
							System.out.print(score);
							continue outer;
						}
					if(ox2[j+n].equals(o)) {
						n++;  //다음꺼 
						b+=b+n; //보너스점수	
						continue my;
					}else {
						j=j+n-1;
						score+=b+cnt;
						continue in;
						
					}
					
				
				}
			}
		}
}
	}
}
