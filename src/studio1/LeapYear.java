package studio1;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		boolean check = (year%4==0)&&((year%100!=0)||(year%400==0));
		System.out.println(check);
	}

}
