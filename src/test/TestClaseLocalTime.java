package test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TestClaseLocalTime {
	
    LocalDate localDate;

    public static void main(String[] args) {
        LocalDate l = LocalDate.of(2022, Month.JUNE, 22);
        System.out.println(l.getDayOfMonth());
        LocalDate ll = LocalDate.of(2022, Month.JUNE, 23);
        long noDaysBetween = ChronoUnit.DAYS.between(l, ll);
        System.out.println(noDaysBetween);

        /**
         * Calcular dias entre dos fechas
         * 
         * LocalDate date =
         * convertToLocalDateViaInstant(fechaCheckIn.getDate()); LocalDate dte2
         * = convertToLocalDateViaInstant(fechaCheckOut.getDate()); long noDays
         * = ChronoUnit.DAYS.between(date, dte2); System.out.println(noDays);
         * 
         * 
         * public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
         * return dateToConvert.toInstant() .atZone(ZoneId.systemDefault())
         * .toLocalDate(); }
         */
    }

}
