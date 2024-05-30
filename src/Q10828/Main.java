package Q10828;

import java.util.Scanner;

public class Main {

	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder p = new StringBuilder();

		int input = sc.nextInt();

		stack = new int[input];

		for (int i = 0; i < input; i++) {

			String str = sc.next();

			switch (str) {

			case "push":
				push(sc.nextInt());
				break;

			case "pop":
				p.append(pop()).append('\n');
				break;

			case "size":
				p.append(size()).append('\n');
				break;

			case "empty":
				p.append(empty()).append('\n');
				break;

			case "top":
				p.append(top()).append('\n');
				break;
			}

		}
		System.out.println(p);
		sc.close();
	}

	public static void push(int item) {
		stack[size] = item;
		size++;
	}

	public static int pop() {
		if (size == 0) {
			return -1;
		} else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res; // res´Â °á°ú
		}
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int top() {
		if (size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}
	}

}
