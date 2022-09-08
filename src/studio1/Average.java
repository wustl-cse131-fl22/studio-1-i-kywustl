package studio1;

import java.util.Scanner;

public class Average {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num to avg");
		double n1 = sc.nextDouble();
		System.out.println("Enter second num to avg");
		double n2 = sc.nextDouble();
		
		System.out.println("The average of "+n1+" and "+n2+"is "+(n1+n2)/2);
	}

}
