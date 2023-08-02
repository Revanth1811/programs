package mypackage;
import java.util.*;
public class IPA4 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		Employee[] arr=new Employee[4];
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextDouble();sc.nextLine();
			boolean e=sc.nextBoolean();sc.nextLine();
			
			arr[i]=new Employee(a,b,c,d,e);
		
		}
		String Branch =sc.nextLine();
		
		int res1=findCountOfEmployeesUsingCompTransport(arr,Branch);
		if(res1!=0) {
			System.out.println(res1);
		}
		else {
			System.out.println("No such Branch");
		}
		
		Employee[] res2=findEmployeeWithSecondHighestRating(arr);
		if(res2!=null) {
			int i=1;
			System.out.println(res2[i].getEmployeeld());
			System.out.println(res2[i].getName());
		}
		else {
			System.out.println("null");
		}
	}
	
	public static int findCountOfEmployeesUsingCompTransport(Employee[] arr,String Branch) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getBranch().equalsIgnoreCase(Branch)) {
				if(arr[i].isCompany_Transport()) {
					count=count+1;
				}
			}
		}
		return count;
	}
	
	public static Employee[] findEmployeeWithSecondHighestRating(Employee[] arr ) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(!arr[i].isCompany_Transport()) {
				count++;
			}
		}
		Employee[] emp=new Employee[count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(!arr[i].isCompany_Transport()) {
				emp[j]=arr[i];j++;
			}
		}
		
		for(int i=0;i<count;i++) {
			for(j=i+1;j<emp.length;j++) {
				if(emp[i].getRating()<emp[j].getRating()) {
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		return emp;
	}
}

class Employee{
	private int employeeld ;
	private String name ;
	private String branch ;
	private double rating;
	private boolean company_Transport;
	
	public Employee(int employeeld, String name, String branch, double rating, boolean company_Transport) {
		this.employeeld = employeeld;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.company_Transport = company_Transport;
	}

	public int getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(int employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean isCompany_Transport() {
		return company_Transport;
	}

	public void setCompany_Transport(boolean company_Transport) {
		this.company_Transport = company_Transport;
	}
}
