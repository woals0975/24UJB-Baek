package Q1149;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 집 개수
		int[] arr1 = new int[a];
		int[] arr2 = new int[a];
		int[] arr3 = new int[a]; 
		int x = 0;  // 3개마다 1씩올리기 
		for(int i=0; i<a*3;i++ ) {
			int b = sc.nextInt();
			if(i%3==0) {
				arr1[x]=b;
			}else if(i%3==1) {
				arr2[x]=b;
			}else if(i%3==2) {
				arr3[x]=b;
				x++;
			}
			
		}
	
		for(int i=0; i<a-1; i++) {
			int f=arr1[i]+ arr2[i+1];
			int l=arr1[i]+ arr3[i+1];
			if(f>=l) {
				arr1[i]=l;
			}else {
				arr1[i]=f;
			}
		}
		System.out.print(Arrays.toString(arr1));
		
		for(int i=0; i<a-1; i++) {
			int f=arr2[i]+ arr1[i+1];
			int l=arr2[i]+ arr3[i+1];
			if(f>=l) {
				arr1[i]=l;
			}else {
				arr1[i]=f;
			}
		}
		
		for(int i=0; i<a-1; i++) {
			int f=arr3[i]+ arr1[i+1];
			int l=arr3[i]+ arr2[i+1];
			if(f>=l) {
				arr1[i]=l;
			}else {
				arr1[i]=f;
			}
		}
		int last = 0;
		for(int i=0; i<a-1;i++) {
			last+=Math.min(Math.min(arr1[i], arr2[i]),arr3[i]);
		}
		System.out.print(last);
	} //내일 와서 같은 순서에 있는애 안걸리게 선택하고 다 더하고 빼기 구구혀
	
	}
		