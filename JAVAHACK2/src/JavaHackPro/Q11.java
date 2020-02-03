package JavaHackPro;

import java.util.Iterator;
import java.util.LinkedList;

public class Q11 {
//11.Write a java program to implement your own singly linked list 
//in which delete method deletes an given element in the singly linked list
	
	    Node head; // head of the list 
	  
	    /* Linked List node */
	    class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) { data = d; next = null; } 
	    } 
	  
	    /* Function deletes the entire linked list */
	    void deleteList() 
	    { 
	        head = null; 
	    } 
	  
	    /* Inserts a new Node at front of the list. */
	    public void push(int new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	    } 
	  
	    public static void main(String [] args) 
	    { 
	        LinkedList list = new LinkedList(); 
	        /* Use push() to construct below list 
	           1->12->1->4->1  */
	  
	        list.push(91); 
	        list.push(41); 
	        list.push(18); 
	        list.push(129); 
	        list.push(10); 
	        Iterator<Integer>ite = list.iterator();
	        while(ite.hasNext()) {
	        	System.out.println(ite.next());
	        }
	  
	        System.out.println("Deleting the list"); 
	        System.out.println(list.removeFirst());
	  
	        System.out.println("Linked list deleted"); 
	    } 
	} 

