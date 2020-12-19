
public class PrivateConstructor {
	
	  // create private constructor
		  private PrivateConstructor () {
		    System.out.println("This is a private constructor.");
		  }

		  // create a public static method
		  public static void instanceMethod() {

		    // create an instance of Test class
		    PrivateConstructor obj = new PrivateConstructor();
		  }

		}

		class Main {

		  public static void main(String[] args) {

		    // call the instanceMethod()
		    PrivateConstructor.instanceMethod();
		  }
		}

