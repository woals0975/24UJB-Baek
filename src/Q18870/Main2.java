package Q18870;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n개수
		int[] a = new int[n];  //중복제거 배열
		for(int i=0; i<n;i++) {
			int p = sc.nextInt();
			a[i] = p;
		}

		int[] c =Arrays.copyOf(a, a.length); //  원본 복사 배열
		a=Arrays.stream(a).distinct().toArray(); //중복제거
		int[] b =Arrays.copyOf(a, a.length);  // 중복제거 정렬 배열
		Arrays.sort(b); //오름차순으로 정렬
		outer:
		for(int i=0; i<c.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[j]==c[i]) {
					System.out.print(j+" ");
					continue outer; //하나 만나면 다시 위로
				}
			}
		}
		
		
	}
}

