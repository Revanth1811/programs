package mypackage1;
import java.util.*;

class Bankaccount{
	private int accountNumber;
	private String accountholderName;
	private double balance;
	
	public Bankaccount(int accountNumber,String accountholderName,double balance) {
		this.accountNumber=accountNumber;
		this.accountholderName=accountholderName;
		this.balance=balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountholderName() {
		return accountholderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setAccountholderName(String accountholderName) {
		this.accountholderName=accountholderName;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
}

public class Bank {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		Bankaccount[] arr=new Bankaccount[3];
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			double c=sc.nextDouble();
			
			arr[i]=new Bankaccount(a,b,c);
		}
		int accountnum=sc.nextInt();sc.nextLine();
		double res= withdraw(arr,accountnum);
		if(res!=0) {
			System.out.println(res);
		}
		else {
			System.out.println("Account not found");
		}
	}
public static double withdraw(Bankaccount[] arr,int accountnum) {
	Scanner sc=new Scanner(System.in);
	double rembal=0;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].getAccountNumber()==accountnum) {
			double bal=sc.nextDouble();
			if(arr[i].getBalance()>=bal) {
				 rembal=arr[i].getBalance()-bal;
			}
		}
	}
	return rembal;
}
}
