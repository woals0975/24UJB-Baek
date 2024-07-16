package Q15649;

import java.util.Scanner;

public class Main {
   static int[] c;
   static int M, N;

   public static void f(int n) {
      if (n == N) {
        for (int i = 0; i < N; i++) {
           for (int j = 0; j < N; j++) {
               if (i != j && c[i] == c[j])
                 return;
            }
        }

         for (int i = 0; i < N; i++) {
            System.out.print(c[i] + " ");
         }
         System.out.println();
         return;
      }
      for (int i = 1; i <= M; i++) {
         c[n] = i;
         f(n + 1);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      M = sc.nextInt();
      N = sc.nextInt();
      c = new int[N];
      sc.close();

      f(0);
   }
}
