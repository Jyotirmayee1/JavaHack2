package JavaHackPro;

import java.util.Set;
import java.util.TreeSet;

public class Q4 {

	public static void main(String[] args) {
		//4. Write a java program to store 5 unique elements in sorted order. 
		  //Error should exist if user tries to add duplicates
		Set<Integer> uniq = new TreeSet<>();
		uniq.add(32);
		uniq.add(12);
		uniq.add(4);
		uniq.add(56);
		uniq.add(6);
		//uniq.add(6);
		for(int sortInt:uniq) {
			System.out.println(sortInt);
		}

	}

}
