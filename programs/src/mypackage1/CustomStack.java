package mypackage1;

public class CustomStack {
	
	protected int[] arr;
	private static final int DEFAULT_SIZE=10;
	int top=-1;
	public CustomStack(){
	    this(DEFAULT_SIZE);
	}
	public CustomStack(int size){
	    this.arr=new int[size];
	}
	public boolean push(int item){
	    if(isFull()){
	        System.out.println("Stack is full");
	        return false;
	    }
	    top++;
	    arr[top]=item;
	    return true;
	}
	public int pop()  {
	    if(isEmpty()){
	        System.out.println("Stack is Empty");
	    }
	    int removed=arr[top];
	    top--;
	    return removed;
	}
	public boolean isFull() {
	    return top== arr.length-1;
	}
	public boolean isEmpty(){
	    return top==-1;
	}
	public void display(){
	    for(int i=0;i<=top;i++){
	        System.out.print(arr[i]+">-");
	    }
	    System.out.println("End");
	}
}
