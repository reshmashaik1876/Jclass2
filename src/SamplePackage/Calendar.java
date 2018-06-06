package SamplePackage;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2018, 3, 1);
		LocalDate endDate = LocalDate.of(2018,  6, 15);
		Period p = Period.between(startDate, endDate);
		System.out.println(p.getYears()+"years, "+p.getMonths()+"months, "+p.getDays()+"days");
		
	}
}
