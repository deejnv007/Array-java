package array;

import java.util.Scanner;

public class PercentageOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double sum = 0;
		double avg;
		System.out.println("enter the number of students");
		int n = sc.nextInt();
		int marks[] = new int[n];
		System.out.println("enter the marks now");
		for(int i=0;i<n;i++) {
			marks[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum += marks[i];
		}
		avg = sum/n;
		System.out.println("the avg marks are "+ avg);
		

	}

}
