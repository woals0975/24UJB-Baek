package Q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); // �ݺ�Ƚ��
		int[] bas = new int[a]; // �ٱ��� ������
		for(int i=0;i<a;i++) { // ��� �ٱ��Ͽ� 0�� �ִ´�.
			bas[i]=0;
		}
		outer:
		for(int i=0; i<b;i++) {
			int com1=sc.nextInt();	//����
			int com2=sc.nextInt(); //��
			int com3=sc.nextInt(); //����ȣ
			for(int j=com1-1;j<com2;j++) {
				bas[j]=com3;
			}
			if(i==b-1) {
				for(i=0;i<a;i++) {
					sc.close();
					System.out.print(bas[i]+" ");
					if(i==a-1) {
						break outer;	//������ ������ �ѹ��� ���� �ö󰡼� ���������
					}
				}
			}
		}
	}

}
