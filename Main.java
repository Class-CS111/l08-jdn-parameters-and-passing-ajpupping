// PARTNER NAME: Alyssa Pupping
// PARTNER NAME: N/A
// CS111 SECTION #: 1.6
// DATE: 3/29/25

// Description:  Calculate the Julian Day Number for the given date
// Precondition: Valid integers for the month, day, and year
// Postcondition: Return the calculated Julain Date as an integer

public class Main {

    public static void main(String[] args) 
    {
        // DECLARATION + SECTION

		int month = 0;
		int day = 0;
		int year = 0;
        int jdnDate = 0;

		// INPUT SECTION 
		
		// CALCULATION & PROCESSING SECTION 

        month = 8;
        day = 26;
        year = 1918;
        jdnDate = Main.calculateJulianDay(month, day, year);


		
		// OUTPUT SECTION 
		System.out.println("Julian Day Number for the given date is: " + jdnDate);
    }
    public static int calculateJulianDay(int month, int day, int year)
    {
        int a = 0;
        int m = 0; 
        int y = 0;
        int jdnToday;

        a = (14 - month)/12;
		m = month + 12 * a - 3;
		y = year + 4800 - a;
		jdnToday = day + (153 * m + 2)/5 + (365 * y) + 
							(y/4) - (y/100) + (y/400) - 32045;
        return jdnToday;
    }
}
