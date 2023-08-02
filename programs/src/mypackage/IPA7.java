package mypackage;
import java.util.*;
public class IPA7 {
	public static void main (String args[] ){
		Scanner sc=new Scanner(System.in);
		Flowers[] arr=new Flowers[4];
		
		for(int i=0;i<4;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			String e=sc.nextLine();
			
			arr[i]=new Flowers(a,b,c,d,e);
		}
		String Typ=sc.nextLine();
		
		Flowers[] res=findMinPriceByType(arr,Typ);
		if(res!=null) {
			System.out.println(arr[res.length].getFlowerId());
		}
		else {
			System.out.println("There is no flower with given type");
		}
	}
	public static Flowers[] findMinPriceByType(Flowers[] arr,String Typ) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getType().equalsIgnoreCase(Typ)&& arr[i].getRating()>3) {
				count++;
			}
		}
		
		Flowers[] array=new Flowers[count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getType().equalsIgnoreCase(Typ)&& arr[i].getRating()>3) {
				array[j]=arr[i];j++;
			}
		}
		for(int i=0;i<count;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i].getPrice()>array[j].getPrice()) {
					Flowers temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
}

class Flowers{
	private int flowerId;
	private String flowerName;
	private int price;
	private int rating;
	private String type;
	
	public Flowers(int flowerId,String flowerName,int price,int rating,String type) {
		this.flowerId=flowerId;
		this.flowerName=flowerName;
		this.price=price;
		this.rating=rating;
		this.type=type;
	}
	
	public int getFlowerId() {
		return flowerId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public int getPrice() {
		return price;
	}
	public int getRating() {
		return rating;
	}
	public String getType() {
		return type;
	}
	
	public void setFlowerId(int flowerId) {
		this.flowerId=flowerId;
	}
	public void setFloerName(String flowerName) {
		this.flowerName=flowerName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	public void setType(String type) {
		this.type=type;
	}
	
}