package Q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];
		for (int i = 0; i < hat.length; i++) {
			hat[i] = sc.nextInt();
		}
		sc.close();

		// 9개의 수 합을 구하기
		int sum = 0;
		for (int i = 0; i < hat.length; i++) {
			sum += hat[i];
		}
		

		// 합계에서 제외 할 2개의 수를 선정
		int ai = -1, aj = -1;
		for (int i = 0; i < hat.length; i++) {
			for (int j = 0; j < hat.length; j++) {
				if (i != j) {
					

					if ((sum - (hat[i] + hat[j]) == 100)) {
						ai = i;
						aj = j;
						break;
					}
				}
			}
		}

		for (int k = 0; k < hat.length; k++) {
			if (k != ai && k != aj)
				System.out.println(hat[k]);
		}
	}
}

/*public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[10];
		int i=0;
		while(true) {
		sum[i] = sc.nextInt();
		i++;
		if(i==10) {
			int H = sum[0]+sum[1]+sum[2]+sum[3]+sum[4]+sum[5]+sum[6]+sum[7]+sum[8]+sum[9];
			System.out.print(H);
			break;
		}
		
		
		
		}
		sc.close();
			
	}

}*/
