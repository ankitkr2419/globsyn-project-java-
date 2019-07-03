import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class Info{
	private Scanner sc = new Scanner(System.in);
	private String datec;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	void LocalDate()
	{
		Date date = new Date();
		//System.out.println(dateFormat.format(date));
		
		System.out.println("plese enter the birthday date ");
		datec = sc.next();
		Date date1 = null;
		try {
			 date1 = dateFormat.parse(datec);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long diff =date.getTime() - date1.getTime();
		System.out.println( "your age is :"+(diff / (1000 * 60 * 60 * 24))/365);
	}
	
}
public class TimeDate {

	public static void main(String[] args) {
		Info obj = new Info();
		obj.LocalDate();
	}

}
