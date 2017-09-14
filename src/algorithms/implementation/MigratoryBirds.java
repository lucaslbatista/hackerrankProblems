package algorithms.implementation;

import java.util.Scanner;

public class MigratoryBirds {
	
	static int migratoryBirds(int n, int[] ar) {
		int birds[] = new int[5];
		for (int i = 0; i < ar.length; i++) {
			birds[ar[i]-1]++;
		}
		int maxBirds = -1;
		int maxValue = -1;
		for (int i = 0; i < birds.length; i++) {
			if(birds[i] > maxValue){
				maxValue = birds[i];
				maxBirds = i;
			}
		}
		return maxBirds+1;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
	}

}
