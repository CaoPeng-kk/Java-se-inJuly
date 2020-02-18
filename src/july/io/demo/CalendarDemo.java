package july.io.demo;

import java.util.Calendar;

public class CalendarDemo {

//	private static final int DAY_OF_MONTH = Calendar.DAY_OF_MONTH;
//	private static int DAY = Calendar.DATE;

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();	
//		String week = getweek(Calendar.DAY_OF_WEEK);
//		System.out.println(c);
//		System.out.println(week);
		showdays(2019);
		
		
	}

	public static void showdays(int year) {
		Calendar c = Calendar.getInstance();
		
//		设定具体的日期
		c.set(year, 2, 1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		将设定的日期向前偏移一天就到了二月份的最后一天
		c.add(Calendar.DAY_OF_MONTH , -1);
		
		showDate(c);
		
	}
		
	
	
	public static void showDate(Calendar c) {
		int years = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int days = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(years+","+month+","+days);
	}

	public static String getweek(int dayOfWeek) {
		String [] weeks = {",","wu","liu","ri","yi","er","san","si"};
		return weeks [dayOfWeek];
	}

}
