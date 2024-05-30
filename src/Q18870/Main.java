package Q18870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	   public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      int n = Integer.parseInt(br.readLine());
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      int[] nums = new int[n];
	      for (int i = 0; i < n; i++) {
	         nums[i] = Integer.parseInt(st.nextToken());
	      }

	      int[] numsCo = Arrays.copyOf(nums, n);

	      List<Integer> distinctSortedNums = Arrays.stream(numsCo).distinct().sorted().boxed()
	            .collect(Collectors.toList());

	      Map<Integer, Integer> numMap = new HashMap<>();
	      for (int i = 0; i < distinctSortedNums.size(); i++) {
	         numMap.put(distinctSortedNums.get(i), i);
	      }

	      for (int i = 0; i < n; i++) {
	         int index = numMap.get(nums[i]);
	         bw.write(String.valueOf(index) + " ");
	      }

	      bw.flush();
	      bw.close();
	      br.close();
	   }
	}

