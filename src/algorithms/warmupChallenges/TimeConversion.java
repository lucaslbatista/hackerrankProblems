package algorithms.warmupChallenges;

import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String t) {
		String[] split = t.split(":");
		int h = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		int s = Integer.parseInt(split[2].substring(0, 2));

		String a = split[2].substring(2, 4);

		if (a.equals("PM") && h < 12) {
			h += 12;
		} else if (a.equals("AM") && h == 12) {
			h = 0;
		}

		return String.format("%02d:%02d:%02d", h, m, s);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}

}
