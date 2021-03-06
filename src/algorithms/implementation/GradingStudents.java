package algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");

	}

	static int[] solve(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			int grade = grades[i];
			if(grade != 100 && grade >= 38){
				int newGrade = ((grade/5)*5) + 5;
				int dif = newGrade - grade;
				if(dif < 3){
					grades[i] = newGrade;
				}
			}
		}
		return grades;
	}

}
