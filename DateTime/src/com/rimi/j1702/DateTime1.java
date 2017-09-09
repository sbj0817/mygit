package com.rimi.j1702;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime1 {
	
	public static void main(String[] args) throws ParseException {
	 Calendar c1=Calendar.getInstance();
	 c1.set(2016, 9,17);
	 Calendar c2= Calendar.getInstance();
	 long cs1=c1.getTimeInMillis();
	 long cs2=c2.getTimeInMillis();
	 long day=(cs2-cs1)/(24*60*60*1000);
	 System.out.println(day);
			   
	}

}
