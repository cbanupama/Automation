package com.qsp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat s1 = new SimpleDateFormat("dd");
	    String day = s1.format(date);
	    System.out.println(day);
	    
	    SimpleDateFormat s2 = new SimpleDateFormat("MMMM");
	    String month = s2.format(date);
	    System.out.println(month);
	    
	    SimpleDateFormat s3 = new SimpleDateFormat("yyyy");
	    String year = s3.format(date);
	    System.out.println(year);
	    
	    
	    SimpleDateFormat s4 = new SimpleDateFormat("hh:mm:ss");
	    String time = s4.format(date);
	    System.out.println(time);
		
	}

}
