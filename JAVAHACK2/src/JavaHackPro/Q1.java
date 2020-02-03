package JavaHackPro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q1 {

	public static void main(String[] args) {
	//1. Write a java program to store 5 student information in a treeMapNote:
		//student object has student name and student reg no.
		
	Map<String, Integer> studentList = new HashMap<>();
	 studentList.put("abc", 1);
	 studentList.put("def", 2);
	 studentList.put("ghi", 3);
	 studentList.put("jkl", 4);
	 studentList.put("mno", 4);
	 
	Iterator<Map.Entry<String,Integer>>ite= studentList.entrySet().iterator();
	while(ite.hasNext()) {
	Map.Entry entry=ite.next();
	
	System.out.println(entry.getKey()+"- "+entry.getValue());
	}
		
		
	}

}
