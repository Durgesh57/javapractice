
public class Constructor {

	int sum;

	  // first constructor
	  Constructor() {
	    // calling the second constructor
	    this(5, 2);
	  }

	  // second constructor
	  Constructor(int arg1, int arg2) {
	    // add two value
	    this.sum = arg1 + arg2;
	  }

	  void display() {
	    System.out.println("Sum is: " + sum);
	  }

	  // main class
	  public static void main(String[] args) {

	    // call the first constructor
	    Constructor obj = new Constructor();

	    // call display method
	    obj.display();
	  }
	}

