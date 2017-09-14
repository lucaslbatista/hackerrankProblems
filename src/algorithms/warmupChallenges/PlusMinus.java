package algorithms.warmupChallenges;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		size = in.nextInt();

		int m[] = new int[size];
		for (int i = 0; i < size; i++) {
			m[i] = in.nextInt();
		}

		int countPos = 0;
		int countNeg = 0;
		int countZero = 0;

		for (int i = 0; i < size; i++) {
			if(m[i] > 0){
				countPos++;
			}else if (m[i] < 0){
				countNeg++;
			}else{
				countZero++;
			}
		}
		float result = countPos/(float)size;
		System.out.printf("%.4f", result);
		System.out.println();
		
		result = countNeg/(float)size;
		System.out.printf("%.4f", result);
		System.out.println();
		
		result = countZero/(float)size;
		System.out.printf("%.4f", result);
	}
}