package cn.hero.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyUtlis {
	
	public static String QUERYSTRING_OR = "@@@";
	public static String QUERYSTRING_AND = "^^^";
	
	public static String dateformat(Date d)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		return formatter.format(d);
	}
	
	public static String dateformat2(Date d)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
		return formatter.format(d);
	}
	
	public static Date stringToDate(String d)
	{
		if(d==null||d.trim().equals(""))
		{
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(d);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	
    public static Date addInteger(Date date, int dateType, int amount) {  
        Date myDate = null;  
        if (date != null) {  
            Calendar calendar = Calendar.getInstance();  
            calendar.setTime(date);  
            calendar.add(dateType, amount); 
            myDate = calendar.getTime();  
        }  
        return myDate;  
    } 

    
}

