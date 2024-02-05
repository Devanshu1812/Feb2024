import java.util.Scanner;

 class LeapYearChecker throws IOException
{

    public static void main(String[] args) throws IOException
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap years are divisible by 4
        // But century years are not leap years unless they are divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
