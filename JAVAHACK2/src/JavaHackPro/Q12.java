package JavaHackPro;

import java.util.Deque;
import java.util.LinkedList;

public class Q12 {

	public static void main(String[] args) {
//12. Implement double ended queue using linked list, in which implement
		//methods for the following i) Insert element at front ii) Delete element at front iii) Insert element at rear
		//iv) Delete element at rear v) Display content of stack
    
 Deque<Integer> insert = new LinkedList<>();
 insert.add(200);
 insert.add(300);
 insert.add(100);
 insert.add(500);
 insert.add(400);
 System.out.println("Create integer list"+insert);
 insert.addFirst(600);
 System.out.println("After adding the integer in the front "+insert);
 insert.removeFirst();
 System.out.println("After delete the integer from the front "+insert);
 insert.addLast(700);
 System.out.println("After adding the integer in the rear "+insert);
 insert.removeLast();
 System.out.println("After delete the integer from the rear "+insert);
 
		
	}

}
