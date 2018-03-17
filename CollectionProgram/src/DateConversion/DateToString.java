package DateConversion;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		//// TODO Auto-generated method stub
		//Date d= Calendar.getInstance().getTime();
		//String s= new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(d);
		System.out.println(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(Calendar.getInstance().getTime()));
		
	}

}
