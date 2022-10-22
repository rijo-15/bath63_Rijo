import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateExample {

	public static void main(String[] args) {
	
		
		LocalDate ld = LocalDate.now();
		
		System.out.print("Local Date: ");
		System.out.println(ld);

		
		LocalTime lt = LocalTime.now(); 
		
		
		System.out.print("LocalTime: ");
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		
		
		System.out.print("LocalDateTime: ");
		
		System.out.println(ldt);
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Australia/Sydney"));
		
		System.out.println("ZonedTime in Aus:" );
		
		System.out.println(zdt);
		
	}

}
