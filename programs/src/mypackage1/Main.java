package mypackage1;

public class Main {

	public static void main(String[] args) {
		CustomStack stack=new CustomStack(5);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(5);
        stack.push(6);


        //stack.display();
       System.out.println("Popped Element "+stack.pop());
        //System.out.println("Popped Element "+stack.pop());
        System.out.println("Popped Element "+stack.pop());
        stack.display();


	}

}