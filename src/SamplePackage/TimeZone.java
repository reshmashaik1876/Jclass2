package SamplePackage;
import java.time.zone.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.*;

public class TimeZone {
	public static void main(String[] args) {
		LocalDateTime startDate = LocalDateTime.of(2018, 1, 2, 0,0);
		LocalDateTime endDate = LocalDateTime.of(2018,  1, 15,12,0);
		ZoneId zone1 = ZoneId.of("Europe/Paris");
		ZoneId zone2 = ZoneId.of("America/Chicago");
		ZonedDateTime z1 = ZonedDateTime.of(startDate, zone1);
		ZonedDateTime z2 = ZonedDateTime.of(endDate, zone2);
		Duration d = Duration.between(z1, z2);
		//System.out.println(z1.until(z2.DAYS));
		System.out.println(d.toDays());
		System.out.println(d);
		
		
	}
}
