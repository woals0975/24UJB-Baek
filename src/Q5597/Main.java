package Q5597;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[30];
		int [] b = new int[30];
		int [] c = new int[2];
		int n= 0; //����x �ε���
		for(int i=0;i<30;i++) {
			a[i]=i+1;    //a�迭�� 1~30 ����
		}
		for(int i=0;i<28;i++) {  //28���� �⼮��ȣ ����
			int in = sc.nextInt();
			b[i]=in;
		}
		
		for(int i=0;i<30;i++) {
			for(int j=0;j<28;j++) {
				if(a[i]==b[j]) {
					a[i]=0;
				}
				if(i==29 &&j==27) {
					c = Arrays.stream(a).filter(idx -> idx != 0).toArray();
						System.out.print(c[0]+ " "+ c[1]);
					}
			}
			}
		}
	}

