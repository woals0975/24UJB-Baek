package Q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		String x = "(";
		String y = ")";
		sc.nextLine();
		for (int i = 0; i < in; i++) {
			String a = sc.next();
			String[] b = a.split("");
			int left = 0;
			int right = 0;
			if (b.length % 2 == 0) {
				outer:
				for (int j = 0; j < b.length; j++) {
					if (x.equals(b[j])) {
						left++;
					} else if (y.equals(b[j])) {
						right++;
					}
					if(y.equals(b[0])) {
						System.out.print("NO\n");
						break;
					
					}else if (left < right) {
						System.out.print("NO\n");
						break;
					}else if (j == b.length - 1 && left == right) {
						System.out.print("YES\n");
						break;
					}else if ((j == b.length - 1 && left != right)) {
						System.out.print("NO\n");
						break;
				
			}
			
			
		}
	}else
		System.out.print("NO\n");
}
	}
}

	
