package JavaHackPro;

import java.util.Iterator;
import java.util.PriorityQueue;

/*Q15priorityQueue.Implement minimum priority queue to store student information. Each student has student name(string)and 
 * student id number(int) and priority is nothing but student id. Implement the following methods EnQueue()-adds 
 * student info to queue which maintains order of minimum prioprity DeQueue()-which deletes minimum id holder 
 * information peekMin() which returns student information having minimum id value*/
 
class Students implements Comparable<Students > {
	private String name ;
	private int id;
	//create a constructor to set the name n id
public Students(String Name,int ID) {
	this.name=Name;
	this.id=ID;	
}	
	
	@Override
	public int compareTo(Students st) {
	//compare the id between two student
	if(id<st.id)
	return -1;
	else if(id>st.id)
	return 1;
		return 0;
	}
	
	public String toString() {
		String reasult = "Student name = " +name+ ", id=" +id;
		return reasult ;
		}

	}
public class Q15priorityQueue {

  public static void main(String args[]) {
  
 PriorityQueue<Students> studPQ =new  PriorityQueue<>();
 studPQ.add(new Students("Aa",4));
 studPQ.add(new Students("Ab",1));
 studPQ.add(new Students("Ac",3));
 studPQ.add(new Students("Ae",5));
 studPQ.add(new Students("Ad",2));
 
 System.out.println("Size of queue" +studPQ.size());
 
  Iterator<Students> ite = studPQ.iterator();
  while(ite.hasNext())
	  System.out.println(ite.next());
  System.out.println(" the item of the queue" +studPQ.peek());
  System.out.println(" the item of the queue" +studPQ.poll().toString());
 
}
}