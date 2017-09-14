package algorithms.warmupChallenges;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		size = in.nextInt();
		for (int i = 0; i < size; i++) {
			String format = "%" + (size - i) + "s";
			printCaracter(format, i + 1, size);
		}
	}

	private static void printCaracter(String format, int times, int size) {
		if (times != size) {
			System.out.printf(format, "#");
			times--;
		}
		for (int i = 0; i < times; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
}
