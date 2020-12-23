package javapractice;

/**
 * @author 
 * Program to set the name of an thread
 *
 */
class TestJoinMethod3 extends Thread{  
	private int  i=1;
	  public void run(){  
		  i++;
	   System.out.println("running..."+i);  
	  }  
	  public TestJoinMethod3(String t) {
		  System.out.println("print the thread name"+t.toString());
	  }
	 public static void main(String args[]){ 
		 System.out.println("This is ,main thread");
	  TestJoinMethod3 t1=new TestJoinMethod3("Thread 1");  
	  TestJoinMethod3 t2=new TestJoinMethod3("Thread 2"); 
	  synchronized (t2) {
		  t1.start();  
		  	
		  	t2.start();
	}
	  	
	  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	  System.out.println("id of t1:"+t1.getId());  
	  
	   
	  
	  t1.setName("Sonoo Jaiswal");  
	  System.out.println("After changing name of t1:"+t1.getName());  
 }  
	}  