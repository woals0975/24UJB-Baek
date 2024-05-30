package Q10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] s= new int[n];
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			s[i]=a;
		}
		int search = sc.nextInt();
		int cnt= 0;
		for(int i=0;i<n;i++) {
			if(s[i]==search) {
				cnt++;
			}else {
				
			}
			
		}
		System.out.print(cnt);
	}

}
