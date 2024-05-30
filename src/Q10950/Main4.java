package Q10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//¿Ü¿ö¶ó
		SJStack stk;
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			stk = new SJStack(cnt);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();
//				System.out.println(cmd);

				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
//					System.out.println(cmd2);
					int p = Integer.parseInt(cmd2);
					stk.push(p);
				} else if (cmd.equals("pop")) {
					stk.pop();
				} else if (cmd.equals("top")) {
					stk.top();
				} else if (cmd.equals("size")) {
					stk.size();
				} else if (cmd.equals("empty")) {
					stk.empty();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class SJStack {
	private int ar[];
	private int top;

	public SJStack(int size) {
		ar = new int[size];
		top = -1;
	}

	public void push(int X) {
		ar[++top] = X;
	}

	public void pop() {
		if (top == -1) {
			System.out.println(top);
		} else {
			System.out.println(ar[top--]);
		}
	}

	public void size() {
		System.out.println(top + 1);
	}

	public void empty() {
		if (top == -1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void top() {
		if (top == -1) {
			System.out.println(top);
		} else {
			System.out.println(ar[top]);
		}
	}
}