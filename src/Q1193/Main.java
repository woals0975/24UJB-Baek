package Q1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // ���ϴ� ������ �м�
		sc.close();
		int sum = 0; // ���� �ִ�
		int pre = 0; // ���� �ּ�
		int x = 1; // ����
		int k = 1; // �и�
		int z = 0; // ��
		outer: for (int i = 1;; i++, x++) { // �־��� a���� sum���� �۾��������� �ݺ�
			sum += i;
			z = x; // x�� ���߿� ���鼭 ����ǹǷ� �̸� ���� ������ z�� �����ص�
			if (a >= pre && a <= sum) { // a���� �ּҰ� �ִ밪 �����϶� �м�ã�� ����
				for (int j = pre + 1; j <= sum; j++) {// �ּҰ�=������ �ִ밪�̱⋚���� +1����� ������ ���������� �̵�
					if (j == a && z % 2 == 1) { // Ȧ�����϶��� ���
						System.out.print(x + "/" + k);
						break outer; // ������ for�� ������ ��
					}
					if (j == a && z % 2 == 0) { // ¦�����϶��� ����
						System.out.print(k + "/" + x); // ������ �ݴ�⶧���� ���ںи� �ٲٱ�(�߾ӱ��� ���� �Ÿ��� ������ ���ںи� ��ġ���ٲ� ���������)
						break outer; // ������ for�� ������ ��
					}
					x--; // �������� �ö󰡸� x�� ����
					k++; // �������� �ö󰡸� k�� ����
				}
			}
			pre = sum; // �ּҰ� ����
		}
	}

}
