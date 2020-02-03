package JavaHackPro;

 class car extends Thread{
	 public void run() {
		 for(int i=1;i<=5;i++) {
		 System.out.println(" Diesel");
		 try{Thread.sleep(1000);}
		 catch (Exception e) {}
	
	 }
 }
 
 }
class bike extends Thread{
	 public void run() {
		 for(int i=1;i<=5;i++) {
	 
		 System.out.println(" Petrol");
		 try{Thread.sleep(1000);}
		 catch (Exception e) {}
	 }
} 
 
}
public  class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 car object1= new car();
  bike object2= new bike();
  object1.start();
  try{Thread.sleep(1000);}
	 catch (Exception e) {}
  object2.start();
	}

}
