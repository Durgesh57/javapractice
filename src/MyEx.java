package javapractice;


public class MyEx extends Exception { }
class ExTestDrive {
	public static void main(String [] args) {
		String test = args[0];
		try {
			System.out.print("t");
			doRisky(test);
			System.out.print("o");
		} catch ( MyEx e) {
			System.out.print("a");
		} finally {
			System.out.print("w");
		}
		System.out.println("s"); 
	}
	static void doRisky(String t) throws MyEx {
		System.out.print("h");
	}
}


