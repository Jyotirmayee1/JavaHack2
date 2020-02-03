package JavaHackPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import Comparable.Q12sud;

public class studentQ2{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Q2Studentinformation> studentrank=new ArrayList<>();
		
		
		studentrank.add(new Q2Studentinformation("Abc", 2,800));
		studentrank.add(new Q2Studentinformation("Def", 1,700));
	    studentrank.add(new Q2Studentinformation("Ghi", 4,1200));
	    studentrank.add(new Q2Studentinformation("Klm", 3,200));
	    
	    Comparator<Q2Studentinformation>com=new Comparator<Q2Studentinformation>() {

			public int compare(Q2Studentinformation Q1, Q2Studentinformation Q2) 
				{if(Q1.getMarks()>Q2.getMarks())
				return 1;
				return -1;
				}
	    };
	    
	Collections.sort( studentrank,com ) ;
	for(Q2Studentinformation s:studentrank) {
		System.out.println(s);
		
	}}}
		
