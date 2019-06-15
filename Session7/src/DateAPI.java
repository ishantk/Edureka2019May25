import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAPI {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(">> Today is: "+date);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		
		String formattedDate = sdf.format(date);
		System.out.println("formattedDate is: "+formattedDate);
		
		// Calendar API -> explore it :)
	}

}
