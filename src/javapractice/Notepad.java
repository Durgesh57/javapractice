package javapractice;

public class Notepad {
	public static void main(String args[])throws Exception{ 
		 Runtime.getRuntime().exec("notepad");//will open a new notepad 

		//		 use -s switch to shutdown system, -r switch to restart system and -t switch to specify time delay
		// Runtime.getRuntime().exec("shutdown -s -t 0");
		System.out.println(Runtime.getRuntime().availableProcessors());
	}  
//	Runtime r=Runtime.getRuntime();  
//	System.out.println("Total Memory: " +r.totalMemory()); 
//	
//	System.out.println("Free Memory: "+r.freeMemory());  
//
//	for(int i=0;i<10000;i++)
//	{  
//		new Notepad();  
//	}  
//	System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
//	System.gc();  
//	System.out.println("After gc(), Free Memory: "+r.freeMemory());  

}  

