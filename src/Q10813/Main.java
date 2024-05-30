package Q10813;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 공개수
		int m = sc.nextInt();// 교환회수
		int[] b = new int[n]; //공 배열
		int s = 1; //공번호
		for(int i=0; i<n; i++,s++) { //배열에 순서대로 번호넣기
			b[i] = s;
		}
		for(int i=0; i<m;i++) { //교환
			int[] back = Arrays.copyOf(b, b.length);  //공 배열 백업 1 2 3 4 5
			int f = sc.nextInt(); //교환 대상 1
			int l = sc.nextInt(); //교환 대상 2
			b[f-1] = back[l-1];
			b[l-1] = back[f-1];
		}
		for(int i=0; i<n;i++) {
			System.out.print(b[i]+ " ");
		}
	}

}
