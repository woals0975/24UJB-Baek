package Q1913;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
				
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 달팽이 크기
		int num = sc.nextInt();// 좌표값을 원하는 값
		sc.close();
		int pre = 0;// 최소값
		int sum = 0;// 최대값
		int a = 0;
		int x = (N / 2) + 1; // 중앙 좌표값 x 세로가 x
		int y = (N / 2) + 1; // ; ; y 가로가 y
		int x2 = (N/2);      //실질적인 배열의 x 인덱스값
		int y2 =(N/2);		//실질적인 배열의 y 인덱스값
		int far = 0;// 중앙으로부터 얼마나 떨어져있나? (중심점 1)
		int turn = 2; //방향전환 2번마다 go가 1씩늘어남 
		int go = 1; //앞으로 이동 가능 거리
		int [][] snail = new int[N][N];
		
			for (int i = 1; ; i++, far++, a++) {
				if (i == 1) {
					sum = 1;
				} else {
					sum += 8 * a;
				}
			
			if (num>sum) {
				for(i=pre-1;i<sum;i++){
					if(i==0) { //첫시작 중앙일때
					snail[x2][y2]=1;
					x2--;
					turn++;
					continue;
					}
					if(turn%2==0) { //턴을 두번하면 go++
						go++;
					}
					for(int j =0 ;j<go;j++) {
						
					}

			
				
			}
		}
	
		
		
		
		
		// 좌표 
		outer: 

			// 1 8 16 24
			if (num > pre && num <= sum) {
				int m = (sum - pre) / 4; // 해당구간의 개수를 4로 나누어 상하좌우

				if (num > pre + 1 && num <= pre + m + 1) { // 우상 이전값+1 해줘야 다음칸값시작값
					x = 1; // 첫값 조정
					y = y - (far - 1);// y 첫값조정
					for (int j = pre + 1; j < pre + m + 1; j++) {
						y++;
						if (j == num - 1) {
							System.out.print(x + " " + y);
							break outer;

						}
					}
				}
				if (num > pre + m + 1 && num <= pre + 2 * m + 1) { // 우하
					x = x - (far - 1);
					y = N;
					for (int j = pre + m + 1; j < pre + 2 * m + 1; j++) {
						x++;
						if (j == num - 1) {
							System.out.print(x + " " + y);
							break outer;

						}
					}
				}
				if (num > pre + 2 * m + 1 && num <= pre + 3 * m + 1) { // 좌하
					x = N;
					y = y + (far - 1);
					for (int j = pre + 2 * m + 1; j < pre + 3 * m + 1; j++) {
						y--;
						if (j == num - 1) {
							System.out.print(x + " " + y);
							break outer;

						}
					}
				}
				if (num > pre + 3 * m + 1 && num <= pre + 4 * m + 1) { // 좌상
					x = x + (far - 1);
					y = 1;
					for (int j = pre + 3 * m + 1; j < pre + 4 * m + 1; j++) {
						x--;
						if (j == num - 1) {
							System.out.print(x + " " + y);
							break outer;

						}
					}
				}
			}
		
			pre = sum;
		}
	}
}
