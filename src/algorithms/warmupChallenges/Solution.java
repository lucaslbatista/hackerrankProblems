package algorithms.warmupChallenges;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextLong();
		}

		long max = 0;
		long min = Long.MAX_VALUE;
		long sum = 0;

		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					continue;
				}
				sum += arr[j];
			}

			if (sum > max) {
				max = sum;
			}

			if (sum < min) {
				min = sum;
			}
		}

		System.out.println(min + " " + max);
	}

}
