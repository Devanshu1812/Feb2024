 class LeapYearChecker
{

    public static void main (String[] args) 
     {

        int year = 5067;

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) 
    {
        // Leap years are divisible by 4
        // But century years are not leap years unless they are divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
         
    

    
}
