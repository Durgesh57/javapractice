

	import java.io.File;

	class Main {
	  public static void main(String[] args) {

	    // creates a file object with specified path
	    File file = new File("C:\\Users\\dell\\Downloads\\eclipse-jee-2020-09-R-win32-x86_64\\eclipse");

	    // tries to create a new directory
	    boolean value = file.mkdir();
	    if(value) {
	      System.out.println("The new directory is created.");
	    }
	    else {
	      System.out.println("The directory already exists.");
	    }
	  }
	}


