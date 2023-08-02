package mypackage;
import java.util.*;
public class IPA3 {
	public static void main(String args[] ){
		Scanner sc=new Scanner(System.in);
		Hotel[] arr=new Hotel[4];
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			String e=sc.nextLine();
			double f=sc.nextDouble();sc.nextLine();
			
			arr[i]=new Hotel(a,b,c,d,e,f);
		}
		String Month=sc.nextLine();
		String wifi=sc.nextLine();
		
		int res1=noOfRoomsBookedInGivenMonth(arr,Month );
		if(res1!=0) {
			System.out.println(res1);
		}
		else {
			System.out.println("No Rooms booked in given month");
		}
		
		int res2=searchHotelByWifiOption(arr,wifi);
		if(res2!=0) {
			System.out.println(res2);
		}
		else {
			System.out.println("No such Option Available");
		}
		
	}
	static int noOfRoomsBookedInGivenMonth(Hotel[] arr,String Month ) {
		int rooms=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getDateOfBooking().contains(Month)) {
				rooms=arr[i].getNoofRoomsBooked();
			}
		}
		return rooms;
	}
	
	static int searchHotelByWifiOption(Hotel[] arr,String wifi) {
		
		int[] id=new int[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getWifiFacility().equalsIgnoreCase(wifi)) {
				id=Arrays.copyOf(id, id.length+1);
				id[id.length-1]=arr[i].getHotelId();
				Arrays.sort(id);
			}
		}
		if(id.length>0){
			return id[id.length-2];
		}
		else {
			return 0;
		}
		
	}
}

class Hotel{
	private int hotelId;
	private String hotelName;
	private String dateOfBooking;
	private int noofRoomsBooked;
	private String wifiFacility;
	private double totalBill;
	
	public Hotel(int hotelId, String hotelName, String dateOfBooking, int noofRoomsBooked, String wifiFacility,
			double totalBill) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.dateOfBooking = dateOfBooking;
		this.noofRoomsBooked = noofRoomsBooked;
		this.wifiFacility = wifiFacility;
		this.totalBill = totalBill;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public int getNoofRoomsBooked() {
		return noofRoomsBooked;
	}

	public void setNoofRoomsBooked(int noofRoomsBooked) {
		this.noofRoomsBooked = noofRoomsBooked;
	}

	public String getWifiFacility() {
		return wifiFacility;
	}

	public void setWifiFacility(String wifiFacility) {
		this.wifiFacility = wifiFacility;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	
	
}
