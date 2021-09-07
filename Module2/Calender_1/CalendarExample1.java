package Calender_1;

import java.util.Calendar;  
public class CalendarExample1 {  
	
   public static void main(String[] args) {  
	   ////date
	   java.util.Date date=new java.util.Date();  
	   System.out.println(date);  
	   long millis=System.currentTimeMillis();  
	   java.util.Date date1=new java.util.Date(millis);  
	   System.out.println(date1); 
	   ///////
   Calendar calendar = Calendar.getInstance();  
   System.out.println("The current date is : " + calendar.getTime());  
   calendar.add(Calendar.DATE, -15);  
   System.out.println("15 days ago: " + calendar.getTime());  
   calendar.add(Calendar.MONTH, 4);  
   System.out.println("4 months later: " + calendar.getTime());  
   calendar.add(Calendar.YEAR, 2);  
   System.out.println("2 years later: " + calendar.getTime());  
   calendar.add(Calendar.DATE,6);
   System.out.println("6 days after:" +calendar.getTime());
   calendar.add(Calendar.MONTH,9);
   System.out.println(calendar.getTime());
   //Second Example
   System.out.println(calendar.get(Calendar.YEAR));  
   System.out.println(calendar.get(Calendar.DATE));  
   System.out.println(calendar.get(Calendar.MONTH));  
   
   //third
   int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);  
  System.out.println("maximum no of  days in week & weeks in  year");
   System.out.println( maximum);  
   maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  
   System.out.println(  maximum);  
   
   int min1 = calendar.getMinimum(Calendar.DAY_OF_WEEK);  
   System.out.println(min1); 
   int min11=calendar.getMinimum(Calendar.DAY_OF_YEAR);
   min11 = calendar.getMinimum(Calendar.WEEK_OF_YEAR);  
   System.out.println(min11);
   
}
}

