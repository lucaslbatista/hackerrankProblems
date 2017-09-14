package algorithms.warmupChallenges;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		size = in.nextInt();
		
		int m[][] = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				m[i][j] = in.nextInt();
			}
		}
		
		int sumPrimaryDiagonal = 0;
		int sumSecondaryDiagonal = 0;
		for (int i = 0, j = size-1; i < size; i++, j--) {
			sumPrimaryDiagonal += m[i][i];
			sumSecondaryDiagonal += m[i][j];
		}
		
		System.out.println(Math.abs(sumPrimaryDiagonal-sumSecondaryDiagonal));
	}

}
