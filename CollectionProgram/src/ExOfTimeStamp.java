import java.sql.Timestamp;
import java.sql.Date;


public class ExOfTimeStamp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timestamp tm=new Timestamp (System.currentTimeMillis());
		System.out.println(tm);
		Date d=new Date(tm.getTime());
		System.out.println(d);

	}

}
