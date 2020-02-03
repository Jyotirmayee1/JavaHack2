package JavaHackPro;

import java.util.ArrayList;
import java.util.Iterator;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(13);
		nums.add(384);
		nums.add(567);
		nums.add(143);
		nums.add(84);
		nums.add(67);
		nums.remove(new Integer(84));
		
		Iterator<Integer>it=nums.iterator();
		while(it.hasNext())
	
		System.out.println(it.next());
		

	}

}
