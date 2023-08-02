package mypackage;
import java.lang.reflect.Array;
import java.util.*;
public class IPA5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Course[] arr=new Course[4];
		
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			int e=sc.nextInt();sc.nextLine();
			
			arr[i]=new Course(a,b,c,d,e);
		}
		
		String courseadmin=sc.nextLine();
		int hands=sc.nextInt();
		
		int res1=findAvgOfQuizByAdmin(arr,courseadmin );
		if(res1!=0) {
			System.out.println(res1);
		}
		else {
			System.out.println("No Course found");
		}
		
		Course[] res2=sortCourseByHandsOn (arr, hands);
		
		if(res2!=null) {
			for(int i=0;i<res2.length;i++) {
				System.out.println(res2[i].getCourseName());
			}
		}
		else {
			System.out.println("No Course found with mentioned attributes.");
		}
		
		
	}
	
	public static int findAvgOfQuizByAdmin(Course[] arr,String courseadmin ) {
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getCourseAdmin().equalsIgnoreCase(courseadmin)) {
				avg=avg+arr[i].getQuiz();
			}
		}
		return avg/2;
	}
	
	public static Course[] sortCourseByHandsOn (Course[] arr,int hands) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getHandson()<hands) {
				count++;	
			}
		}
		
		Course[] array=new Course[count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getHandson()<hands) {
				array[j]=arr[i];j++;
			}
		}
		
		for(int i=0;i<count;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i].getHandson()>array[j].getHandson()) {
					Course temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
		
	}
}

class Course{
	private int courseId;
	private String courseName;
	private String courseAdmin;
	private int quiz;
	private  int handson ;
	
	public Course(int courseId,String courseName,String courseAdmin,int quiz,int handson) {
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseAdmin=courseAdmin;
		this.quiz=quiz;
		this.handson=handson;
	}
	
	public int getCourseId(){
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId=courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseAdmin() {
		return courseAdmin;
	}

	public void setCourseAdmin(String courseAdmin) {
		this.courseAdmin = courseAdmin;
	}

	public int getQuiz() {
		return quiz;
	}

	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}

	public int getHandson() {
		return handson;
	}

	public void setHandson(int handson) {
		this.handson = handson;
	}
	
	
	
}
