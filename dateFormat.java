package walmartProblem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date1 = new Date();
		
		System.out.println(date1);
		
		SimpleDateFormat date2 = new SimpleDateFormat("MMM dd, yyyy");
		
		System.out.println(date2.format(date1));

	}

}
