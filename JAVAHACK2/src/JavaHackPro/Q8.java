package JavaHackPro;

import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// 8. Store user defined employee objects into arraylist 
		//and Remove duplicates from arraylist without using collections.

		Scanner sc = new Scanner(System.in); 
        ArrayList<String> employeeList = new ArrayList<String>(); 
         
        while(sc.hasNext()) 
        { 
            employeeList.add(sc.nextLine()); 
            System.out.println(employeeList.toString()); 
        } 
}}
