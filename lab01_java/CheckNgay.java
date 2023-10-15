//LeQuocViet20215165
package lab01_java;

import java.util.Scanner;

public class CheckNgay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int daysInMonth = 0;
        boolean validInput = false;
		//        checkYear

        while (!validInput) {
            System.out.print("Enter a year (non-negative number): ");
            year = input.nextInt();

            if (year >= 1000&&year<10000) {
                validInput = true;
            } else {
                System.out.println("Invalid year. Please enter a non-negative number.");
            }
        }

        validInput = false;
        
		//        checkMonth

        while (!validInput) {
            System.out.print("Enter a month (full name, abbreviation, 3 letters, or number): ");
            String monthInput = input.next();

            switch (monthInput) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    month = 1;
                    validInput = true;
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    month = 2;
                    validInput = true;
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    month = 3;
                    validInput = true;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    month = 4;
                    validInput = true;
                    break;
                case "may":
                case "5":
                    month = 5;
                    validInput = true;
                    break;
                case "june":
                case "jun":
                case "6":
                    month = 6;
                    validInput = true;
                    break;
                case "july":
                case "jul":
                case "7":
                    month = 7;
                    validInput = true;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    month = 8;
                    validInput = true;
                    break;
                case "september":
                case "sep.":
                case "sep":
                case "9":
                    month = 9;
                    validInput = true;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    month = 10;
                    validInput = true;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    month = 11;
                    validInput = true;
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    month = 12;
                    validInput = true;
                    break;
                default:
                    System.out.println("Invalid month. Please enter a valid month.");
            }
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            // Leap year
            int[] daysInLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            daysInMonth = daysInLeapYear[month];
        } else {
            // Common year
            int[] daysInCommonYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            daysInMonth = daysInCommonYear[month];
        }

        System.out.println("There are " + daysInMonth + " days in the selected month and year.");
        input.close();
    }
}
