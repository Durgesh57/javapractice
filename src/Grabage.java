package javapractice;

public class Grabage {
	 
		 public void finalize(){System.out.println("object is garbage collected");}  
		 public static void main(String args[]){  
		  Grabage s1=new Grabage();  
		  Grabage s2=new Grabage();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
		 }  
		}  


