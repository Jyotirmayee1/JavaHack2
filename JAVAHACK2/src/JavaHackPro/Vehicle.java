package JavaHackPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vehicle  {




	public static void main(String[] args) {
		
		
		//vehicle number, vehicle model, total duration parked in minutes.
		
	
		
		List<VechileInfo> info =new ArrayList<>();
		
		info.add(new VechileInfo(111,"Accura",90));
		info.add(new VechileInfo(122,"BMW",100));
		info.add(new VechileInfo(133,"Toyota",120));
		info.add(new VechileInfo(111,"Honda",150));
		
	 Comparator<VechileInfo>com=new Comparator<VechileInfo>() {

				public int compare(VechileInfo v1, VechileInfo v2) 
					{if(v1.getMinutes()> v2.getMinutes())
					return 1;
					return -1;
					}

	 };
	Collections.sort(info,com );
	for(VechileInfo V:info) {
		System.out.println(V);
	}
	
	
	}


	}

	
