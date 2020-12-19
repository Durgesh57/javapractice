


public class create {
	String color;
	String make;
	Boolean engine;
	
	create(String color,String make,Boolean engine){
		this.color=color;
		this.make=make;
		this.engine=engine;
	}
	
	void startEngine()
	{
		if(engine==true) {
			System.out.println("Engine has already start");
		}
		else {
			engine=true;
			System.out.println("Engine starts");
		}
		
	}
	
	void atts() {
		
		System.out.println("Color of Motorcycle is "+color+" and made by "+make);
	}

}

 class MotorCycle{
	
	public static void main(String args[]) {
	create cr = new create("red","Yamaha",true);
	cr.startEngine();
	cr.atts();
	
	}
	
}
