/* @purpose  	: To display calendar.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 30.05.19
 */

package com.bridgeit.DataStructure;

public class CalendarDisplay {

	public int getDay(int year,int month,int day)
	{
		int y0,x,m0,d0;
		y0=year-(14-month)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0=month+12*((14-month)/12)-2;
		d0=(day + x + (31*m0 )/ 12) % 7;
		return d0;
	}
	public boolean isLeapYear(int year)
	{
		if(year%4==0 && year%100!=0 && year%400==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		CalendarDisplay obj=new CalendarDisplay();
	    int day=obj.getDay(year, month, 0);//day of 1 date
	   
	    System.out.println("Day : "+day);
	    String months[]= {"","Januvary","Februvary","March","April","May","June","Jule","Augest","September","Octomber","November","December"};
		int days[]= {0,31,29,31,30,31,30,31,31,30,31,30,31};
		boolean leapYear=obj.isLeapYear(year);
		if(month==2 && leapYear)
			days[month]=29;
		
		System.out.println(months[month]+"\t"+year);
		System.out.println("\tSun\tMon\tTue\tWed\tThur\tFri\tSat");
		for(int i=0;i<day;i++)
			System.out.print("\t");
		for(int j=1;j<=days[month];j++)
		{
			System.out.print("	"+j);
			if(((j+day)%7==0) || (j==days[month]))
				System.out.println("\n");
		}	
		
		
	        /*YearMonth yearMonthObject = YearMonth.of(year, month);
	        int daysInMonth = yearMonthObject.lengthOfMonth(); //28  
	      
	        System.out.println("No. of Days : "+daysInMonth);
	        System.out.println("No. of Weeks : "+(daysInMonth/7));*/
	}

}
