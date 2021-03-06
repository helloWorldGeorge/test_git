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
		if(d==null||d.trim().equals("")||d.trim().equals("null"))
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

    public static String autoCutString(String inputString,Integer baseSize)
	{
    	if(inputString==null||baseSize==null||baseSize==0)
    	{
    		return inputString;
    	}
    	inputString = inputString.trim();
    	System.out.println("输入：\r\n"+inputString);
//    	System.out.println(inputString.contains("\r\n"));
//    	System.out.println(inputString.contains("\n"));
    	StringBuffer result = new StringBuffer();
    	if(inputString.contains("\n"))
    	{
    		String cusStrings[] = inputString.split("\n");
    		for(int j=0;j<cusStrings.length;j++)
        	{
    			if(j!=0)
    			{
    				result.append("\r\n");
    			}
    			String eachLine = cusStrings[j].trim();
    			if(eachLine.length()>baseSize)
    			{
        			result.append(cutString(cusStrings[j], baseSize));
    			}else
    			{
    				result.append(eachLine);
    			}
        	}
    	}else
    	{
    		result.append(cutString(inputString, baseSize));
    	}
    	System.out.println("输出：\r\n"+result);
    	return result+"";
	}
    
    public static StringBuffer cutString(String inputString,Integer baseSize)
    {
    	
    	StringBuffer newResult = new StringBuffer();
		int totalLength = inputString.length();
		if(totalLength>baseSize)
		{
			int num = totalLength / baseSize;
//			System.out.println(num);
			String leftString ;
			
			int beginIndex =0;
			int endIndex = 0;
			for(int i=0;i<num;i++)
			{
				beginIndex = i*baseSize;
				endIndex = (i+1)*baseSize;
				String temp = inputString.substring(beginIndex,endIndex);
//				System.out.println(temp.length());
				newResult.append(temp.trim());
				newResult.append("\r\n");
			}
			leftString = inputString.substring((baseSize*num),totalLength);
			newResult.append(leftString);
			
		}
		return newResult;
    }
}

