package Q10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		int num = sc.nextInt();
		int end = 0, x = 0;

		for (int i = 0; i <= num; i++) {
			String cmd = sc.nextLine();
			String cut[] = cmd.split(" ");

			switch (cut[0]) {
			case "push":
				x = Integer.parseInt(cut[1]);
				end = x;
				que.offer(x);
				break;

			case "pop":
				if (que.isEmpty()) {
					System.out.println("-1");
					break;
				} else {
					System.out.println(que.poll());
					break;
				}

			case "size":
				System.out.println(que.size());
				break;

			case "empty":
				if (que.isEmpty()) {
					System.out.println("1");
					break;
				} else {
					System.out.println("0");
					break;
				}

			case "front":
				if (que.isEmpty()) {
					System.out.println("-1");
					break;
				} else {
					System.out.println(que.peek());
					break;
				}

			case "back":
				if (que.isEmpty()) {
					System.out.println("-1");
					break;
				} else {
					System.out.println(end);
					break;
				}
			}

		}
		sc.close();
	}
}
