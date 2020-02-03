package JavaHackPro;

import java.util.Iterator;
import java.util.Stack;

public class Q10 {

	public static void main(String[] args) {
		//10. Write a java program to implement your own stack data structure to store any number of items. And implement the 
		//following operations 1.push 2. pop 3. peek 4.display stack content
 Stack<Integer> StackList= new Stack<>();
 StackList.push(11);
 StackList.push(22);
 StackList.push(33);
 StackList.push(44);
 StackList.push(55);
 
 Iterator<Integer> it1 = StackList.iterator();
	while(it1.hasNext())

	System.out.println(it1.next());
	
	Integer num1=StackList.pop();
	System.out.println( "Stack pop = " +num1);
	
	 num1=StackList.peek();
	 System.out.println( "Stack peek = " +num1);
	  System.out.println("Current Stack => " + StackList);
	
	
	

	}

}
