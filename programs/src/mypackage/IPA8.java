package mypackage;
import java.util.*;
public class IPA8 {
	public static void main (String args[]) {
		Scanner sc=new Scanner (System.in);
		Players [] arr=new Players[4];
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextInt();sc.nextLine();
			
			arr[i]=new Players(a,b,c,d);
		}
		String bat=sc.nextLine();
	}
	public static Players[] searchPlayerForMatch(Players[] arr,String bat) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getSide().equalsIgnoreCase(bat)) {
				count++;
			}
		}
		
		Players[] array=new Players[count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getSide().equalsIgnoreCase(bat)) {
				array[j]=arr[i];j++;
			}
		}
		
		for(int i=0;i<count;i++) {
			for(j=0;j<array.length;j++) {
				Players temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		return array;
	}
}

class Players{
	private int id;
	private String country;
	private String side;
	private double price;
	
	public Players(int id,String country,String side,double price) {
		this.id=id;
		this.country=country;
		this.side=side;
		this.price=price;
	}
	
	public int getId() {
		return id;
	}
	public String getCountry() {
		return country;
	}
	public String getSide() {
		return side;
	}
	public double Price() {
		return price;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public void setSide(String side) {
		this.side=side;
	}
	public void setPrice(double price) {
		this.price=price;
	}
}
