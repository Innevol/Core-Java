package rectArea;

public class childClass extends parentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass obj1 = new childClass();
		
		obj1.override();
		

	}
	
	void override() {
		
		double x = 100;
		
		double y = 25;
		
		System.out.println(x / y);
		
	}

}
