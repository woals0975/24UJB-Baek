package Q10950;

import java.util.Scanner;

public class Main2 {

	static int[] Stack;
	static int size = 0;

	static void push(int num) {
		Stack[size] = num;
		size++;
	}

	static void pop() {
		if (size == 0) {
			System.out.println("-1");
		} else {
			System.out.println(Stack[size - 1]);
			size--;
		}
	}

	static void size() {
		System.out.println(size);
	}

	static void empty() {
		if (size == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	static void top() {
		if (size == 0) {
			System.out.println("-1");
		} else {
			System.out.println(Stack[size - 1]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack = new int[n];
		for (int i = 0; i < n; i++) {
			String input = sc.next();

			switch (input) {

			case "push":
				int p = sc.nextInt();
				push(p);
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "top":
				top();
				break;
			}

		}
		sc.close();
	}
}
