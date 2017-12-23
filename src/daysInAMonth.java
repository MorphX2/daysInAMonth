import java.util.Scanner;

public class daysInAMonth {
    // declaration of the displayDaysOutput, and a string, and integer parameters.
    public static void displayDaysOutput(String monthInput, int yearInput) {
        int monthMod = 28;
        int numOfDays = 0;
        boolean leapYear = false;
        
        // If the year enter is divisible by 4 then it's a leap year. If it is evenly divided by 4 it will return a remainder of 0.
        if ( yearInput % 4 == 0 ) {
            monthMod = monthMod + 1;
            leapYear = true;

        } 
        // Print statement to output the days based on String input. I plan to use the Calender library in my next version.
        switch (monthInput) {
            case "January": numOfDays =  31;
                break;
            case "February": numOfDays = monthMod;
                break;
            case "March": numOfDays = 31;
                break;
            case "April": numOfDays = 30;
                break;
            case "May": numOfDays = 31;
                break;
            case "June": numOfDays = 30;
                break;
            case "July": numOfDays = 31;
                break;
            case "August": numOfDays = 30;
                break;
            case "September": numOfDays = 30;
                break;
            case "October": numOfDays = 31;
                break;
            case "November": numOfDays = 30;
                break;
            case "December": numOfDays = 31;
                break;
            default: numOfDays = 0;
                break;                                    
            }
        // Alerts user that the year entered was a leap year.
        if (leapYear) {
            System.out.println("The year: " + yearInput + " is a leap year. ");
            System.out.println("The month of February will have: " + monthMod + " days.");
        }
        System.out.println("The number of days in " + monthInput + " is " + numOfDays);
    } 
    
    public static void main(String[] args) {
        int year;
        // Instantiating the Scanner Class
        Scanner monthInput = new Scanner(System.in);
        
        System.out.println("Please enter the name of the month: ");
        String month =  monthInput.nextLine();
        
        System.out.println("Please enter the year: ");
        year = monthInput.nextInt();
        
        System.out.println("You entered: " + month + " and the year " + year);
        
        // Passing the variables month and year as arguments to the void function displayDaysOutput.
        displayDaysOutput(month, year);
        
        
    }
    
}
