package JavaHackPro;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool.SynchronizedGrammarPool;

public class Q18 {

	// What is the cause of deadlock in java multithreading.
		//Write a program to create deadlock between two threads
	String Str1=" Hello";
	String Str2=" Hi";
		Thread thread1=new Thread() {
		public void run() {
		while(true){
			synchronized(Str1){
			try {
			System.out.println(Thread.currentThread().getName()+"locked"+Str1);
			Thread.sleep(200);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(Str2){
				System.out.println(Thread.currentThread().getName()+"locked"+Str2);
			System.out.println(Str1+Str2);
			}
			}
		}
		}
		};
		

Thread thread2=new Thread() {
	public void run() {
	while(true){
		synchronized(Str2){
		
		System.out.println(Thread.currentThread().getName()+"locked"+Str1);
		
		synchronized(Str1){
			System.out.println(Thread.currentThread().getName()+"locked"+Str2);
		    System.out.println(Str1+Str2);
		}
		}
	}
	}
	};
		public static void main(String[] args) {	
		
			 Q18 q= new Q18 ();
			 q.thread1.start();
			 q.thread2.start();
}
}
