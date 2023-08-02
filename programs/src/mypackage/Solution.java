package mypackage;
import java.util.*;
public class Solution {
	public static void main(String arga[]) {
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=sc.nextLine();
			}
		}
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j]==a ) {
					System.out.println(arr[i][j]);
				}
			}
		}
		System.out.println(arr[4][4]);
	}
}
