package Q1913;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
				
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ������ ũ��
		int num = sc.nextInt();// ��ǥ���� ���ϴ� ��
		sc.close();
		int pre = 0;// �ּҰ�
		int sum = 0;// �ִ밪
		int a = 0;
		int x = (N / 2) + 1; // �߾� ��ǥ�� x ���ΰ� x
		int y = (N / 2) + 1; // ; ; y ���ΰ� y
		int x2 = (N/2);      //�������� �迭�� x �ε�����
		int y2 =(N/2);		//�������� �迭�� y �ε�����
		int far = 0;// �߾����κ��� �󸶳� �������ֳ�? (�߽��� 1)
		int turn = 2; //������ȯ 2������ go�� 1���þ 
		int go = 1; //������ �̵� ���� �Ÿ�
		int [][] snail = new int[N][N];
		
			for (int i = 1; ; i++, far++, a++) {
				if (i == 1) {
					sum = 1;
				} else {
					sum += 8 * a;
				}
			
			if (num>sum) {
				for(i=pre-1;i<sum;i++){
					if(i==0) { //ù���� �߾��϶�
					snail[x2][y2]=1;
					x2--;
					turn++;
					continue;
					}
					if(turn%2==0) { //���� �ι��ϸ� go++
						go++;
					}
					for(int j =0 ;j<go;j++) {
						
					}

			
				
			}
		}
	
		
		
		
		
		// ��ǥ 
		outer: 

			// 1 8 16 24
			if (num > pre && num <= sum) {
				int m = (sum - pre) / 4; // �ش籸���� ������ 4�� ������ �����¿�

				if (num > pre + 1 && num <= pre + m + 1) { // ��� ������+1 ����� ����ĭ�����۰�
					x = 1; // ù�� ����
					y = y - (far - 1);// y ù������
					for (int j = pre + 1; j < pre + m + 1; j++) {
						y++;
						if (j == num - 1) {
							System.out.print(x + " " + y);
							break outer;

						}
					}
				}
				if (num > pre + m + 1 && num <= pre + 2 * m + 1) { // ����
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
				if (num > pre + 2 * m + 1 && num <= pre + 3 * m + 1) { // ����
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
				if (num > pre + 3 * m + 1 && num <= pre + 4 * m + 1) { // �»�
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
