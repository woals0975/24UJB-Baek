package Q1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 원하는 순서의 분수
		sc.close();
		int sum = 0; // 구간 최대
		int pre = 0; // 구간 최소
		int x = 1; // 분자
		int k = 1; // 분모
		int z = 0; // 행
		outer: for (int i = 1;; i++, x++) { // 주어진 a값이 sum보다 작아질때까지 반복
			sum += i;
			z = x; // x는 나중에 쓰면서 변경되므로 미리 행의 개수를 z로 저장해둠
			if (a >= pre && a <= sum) { // a값이 최소값 최대값 사이일때 분수찾기 시작
				for (int j = pre + 1; j <= sum; j++) {// 최소값=이전의 최대값이기떄문에 +1해줘야 다음행 시작쪽으로 이동
					if (j == a && z % 2 == 1) { // 홀수열일때는 우상
						System.out.print(x + "/" + k);
						break outer; // 끝나면 for문 밖으로 런
					}
					if (j == a && z % 2 == 0) { // 짝수열일때는 좌하
						System.out.print(k + "/" + x); // 방향이 반대기때문에 분자분모 바꾸기(중앙기준 같은 거리에 있을때 분자분모 위치만바뀐 모양을가짐)
						break outer; // 끝나면 for문 밖으로 런
					}
					x--; // 우측위로 올라가면 x값 감소
					k++; // 우측위로 올라가면 k값 증가
				}
			}
			pre = sum; // 최소값 저장
		}
	}

}
