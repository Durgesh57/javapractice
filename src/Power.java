

	public class Power {

	    public static void main(String[] args) {
	        int base = 3, powerRaised = 4;
	        int result = power(base, powerRaised);

	        System.out.printf("%d^%d = %d", base, powerRaised, result);
	    }

	    public static int power(int base, int powerRaised) {
	        if (powerRaised != 0)
	            return (base * power(base, powerRaised - 1));
	        else
	            return 1;
	    }
	}
