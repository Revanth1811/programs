package mypackage;
import java.util.*;
public class Switch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin : ");
		System.out.println();
		System.out.println("----------Instructions-----------");
		System.out.println("Your pin should be Numerical \n"+"Pin must be only two digits ");
		System.out.println("---------------------------------");
		System.out.println();
		int n=sc.nextInt();
		
		if(n>=10 && n<100) {
			System.out.println("Choose your option : ");
			System.out.println("->1.booking\n"+"->2.Status\n"+"->3.Services");
			int a=sc.nextInt();
	
		}
		else {
			System.out.println("Please enter a valid pin ");
		}
	}
}
