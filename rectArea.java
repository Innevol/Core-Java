package rectArea;

public class rectArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectArea area = new rectArea();
		
		area.Area(3, 4);

	}
	
	void Area(int length, int width) {
		
		int answer = length * width;
		
		System.out.println("The area is: " + answer);
		
	}
	
	void Area(double length, double width) {
		
		double answer = length * width;
		
		System.out.println("The area is: " + answer);
		
	}
	
	void Area(short length, short width) {
		
		short answer = (short) (length * width);
		
		System.out.println("The area is: " + answer);
		
	}
	
	void Area(float length, float width) {
		
		float answer = length * width;
		
		System.out.println("The area is: " + answer);
		
	}

}
