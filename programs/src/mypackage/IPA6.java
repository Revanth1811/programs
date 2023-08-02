package mypackage;
import java.util.*;
public class IPA6 {
	public static void main(String args[] ){
		Scanner sc=new Scanner(System.in);
		Antenna[] arr=new Antenna[4];
		for(int i=0;i<4;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextDouble();sc.nextLine();
		
			arr[i]=new Antenna(a,b,c,d);
		}
		String An=sc.nextLine();
		double Av=sc.nextDouble();
		
		int res1=searchAntennaByName(arr, An);
		if(res1!=0) {
			System.out.println(res1);
		}
		else {
			System.out.println("There is no antenna with the given parameter");
		}
		
		Antenna[] res2=sortAntennaByVSWR(arr,Av);
		if(res2!=null) {
			for(int i=0;i<res2.length;i++) {
			System.out.println(res2[i].getProjectLead());
			}
		}
		else {
			System.out.println("No Antenna found");
		}
	}
	public static int searchAntennaByName(Antenna[] arr,String An) {
		int ai=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getAntennaName().equalsIgnoreCase(An)) {
				ai=arr[i].getAntennaid();
			}
		}
		return ai;
	}
	
	public static Antenna[] sortAntennaByVSWR(Antenna[] arr,double Av) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getAntennaVSWR()<Av) {
				count++;
			}
		}
		
		Antenna[] array=new Antenna[count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getAntennaVSWR()<Av) {
				array[j]=arr[i];j++;
			}
		}
		
		for(int i=0;i<count;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i].getAntennaVSWR()>array[j].getAntennaVSWR()) {
					Antenna temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}

}
class Antenna{
	private int antennaid;
	private String antennaName;
	private String projectLead;
	private double antennaVSWR;
	
	public Antenna(int antennaid,String antennaName,String projectLead,double antennaVSWR) {
		this.antennaid=antennaid;
		this.antennaName=antennaName;
		this.projectLead=projectLead;
		this.antennaVSWR=antennaVSWR;
	}
	
	public int getAntennaid() {
		return antennaid;
	}
	public String getAntennaName() {
		return antennaName;
	}
	public String getProjectLead() {
		return projectLead;
	}
	public double getAntennaVSWR() {
		return antennaVSWR;
	}
	
	public void setAntennaid(int antennaid) {
		this.antennaid=antennaid;
	}
	public void setAntennaName(String antennaName) {
		this.antennaName=antennaName;
	}
	public void setProjectLead(String projectLead) {
		this.projectLead=projectLead;
	}
	public void setAntennaVSWR(double antennaVSWR) {
		this.antennaVSWR=antennaVSWR;
	}
}
