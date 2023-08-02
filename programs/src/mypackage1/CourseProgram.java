package mypackage1;

class Course{
    private int courseId;
    private String courseName;
private String courseAdmin;
private int quiz;
private int handson;
public Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseAdmin = courseAdmin;
    this.quiz = quiz;
    this.handson = handson;
}
// getter methods
public int getcourseId(){
    return this.courseId;
}
public String getcourseName(){
    return this.courseName;
}
public String getcourseAdmin(){
    return this.courseAdmin;
}
public int getquiz(){
    return this.quiz;
}
public int gethandson(){
    return this.handson;
}
//setter methods
public void setcourseId(int id){
    this.courseId = id;
}
public void setcourseName(String name){
    this.courseName = name;
}
public void setcourseAdmin(String admin){
    this.courseAdmin = admin;
}
public void setquiz(int quiz){
    this.quiz = quiz;
}
public void sethandson(int handson){
    this.handson = handson;
}
public static int findAvgOfQuizByAdmin(Course array[],String name){
    int count = 0;
    int sum = 0;
    for(int i=0;i<array.length;i++){
        if(array[i].courseAdmin.equals(name)){
            sum += array[i].quiz;
            count++;
        }
    }
    return sum/count;
}
public static Course[] sortCourseByHandsOn(Course array[],int marks){
    int count =0 ;
    for(int i=0;i<array.length;i++){
        if(array[i].handson<marks){
            count++;
        }
    }
    Course arr[] = new Course[count];
    int j=0;
    for(int i=0;i<array.length;i++){
        if(array[i].handson<marks){
            arr[j] = array[i];j++;
        }
    }
    for(int i=0;i<count;i++){
        for(j=i+1;j<arr.length;j++){
            if(arr[i].handson>arr[j].handson){
                Course temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    return arr;
}
}


public class CourseProgram{
    public static void main(String[] args) {
        
    Course course[]  = new Course[4];
    course[0] = new Course(111, "kubernates", "Nisha", 40, 10);
    course[1]=new Course(321, "cassandra", "Roshini", 30, 15);
    course[2] = new Course(457,"Apache Spark","Nisha",30,12);
    course[3] = new Course(987, "site core", "Tirth", 50,20);
    int value = Course.findAvgOfQuizByAdmin(course, "Nisha");
        if(value!=0){
            System.out.println(value);
        }
        else{
            System.out.println("No course found");
        }

        Course arr[] = Course.sortCourseByHandsOn(course, 17);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].getcourseName());
        }
    }
}