package Q3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i =0; i<10;i++) {
			int in = sc.nextInt();
			int in2 = in%42; //42�� ����
			a[i] = in2; //42�� ���� ���������� �迭
		}
		sc.close();
		int b[] = Arrays.stream(a).distinct().toArray(); //�迭�� �ߺ� ����
		System.out.print(b.length);
		
	}
}
