package javapractice;

	public class TestDeamonThread1 extends Thread{  
		 public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
		 }  
		 public static void main(String[] args){  
		  TestDeamonThread1 t1=new TestDeamonThread1();//creating thread  
		  TestDeamonThread1 t2=new TestDeamonThread1();  
		  TestDeamonThread1 t3=new TestDeamonThread1();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
		}  

