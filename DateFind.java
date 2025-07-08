import java.util.Scanner;
public class DateFind
{
    public static void main(String[] args)
     {
        int month, day, year; //date read in from user
        int daysInMonth; //number of days in month read in
        boolean monthValid, yearValid, dayValid; //true if input from user is valid
        boolean leapYear; //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);
        
		//Get integer month, day, and year from user
        System.out.println("Enter a year between 1000 and 1999");
        year=scan.nextInt();

        System.out.println("Enter a month");
        month=scan.nextInt();

        System.out.println("Enter a day");
        day=scan.nextInt();

        //Check to see if month is valid
        if (month>=1 && month<=12) 
        {
            monthValid=true;
        } 
        else 
        {
            monthValid=false;
        }

        //Check to see if year is valid
        if (year>=1000 && year<=1999) 
        {
            yearValid=true;
        } 
        else 
        {
            yearValid=false;
        }
        //Determine whether it's a leap year
        if ((year % 400) == 0) 
        {
            leapYear=true;
        } 
        else if ((year % 4) == 0 && (year % 100) != 0) 
        {
            leapYear=true;
        } else 
        {
            leapYear=false;
        }
        //Determine number of days in month
        switch (month) 
        {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            daysInMonth=31;
            break;
        case 4: case 6: case 9: case 11:
            daysInMonth=30;
            break;
        case 2:
                if (leapYear) 
                {
                    daysInMonth=29;
                } 
                else 
                {
                    daysInMonth=28;
                }
			break;
         default:
            daysInMonth=0;
            break;
        }
        //User number of days in month to check to see if day is valid
        if (day>=1 && day<=daysInMonth) 
        {
            dayValid=true;
        }  
        else 
        {
            dayValid=false;
        }
        //Determine whether date is valid and print appropriate message
        if (monthValid && yearValid && dayValid) 
        {
            System.out.println("The date is valid and you entered : "+day+"/"+month+"/"+year);
                if (leapYear==true) 
                {
                    System.out.println("The year is a leap year");
                } 
                else 
                {
                    System.out.println("The year is not a leap year");
            }
        } 
        else 
        {
            System.out.println("The date is invalid");
        }
        scan.close();
 }
} 