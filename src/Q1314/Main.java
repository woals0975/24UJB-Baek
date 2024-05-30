package Q1314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		if(a.isBlank()) { //비어있거나 공백으로만 이루어지면 true 
						  //비슷한거로 isEmpty 문자열길이 0일때 true
			System.out.print(0);
		}else{	
		String[] b = a.strip().split(" "); //trim도 있음 strip이 더 많은 종류의 공백 제거
		System.out.print(b.length);	
	}

}
}
