package Q27866;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String[] b = a.split("");
	int search = sc.nextInt();;
	System.out.print(b[search-1]);
	

}
}
