package base;
//Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

//Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

//What is your current age? 25
//At what age would you like to retire? 65
//You have 40 years left until you can retire.
//It's 2015, so you can retire in 2055.

import java.util.Scanner;
import java.util.Calendar;
public class base {
    public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    System.out.println("What is your age?");
    String age = input.nextLine();
    System.out.println("What age would you like to retire?");
    String retire = input.nextLine();
        int a = Integer.parseInt(age);
        int b = Integer.parseInt(retire);
        System.out.println("You have " + (b-a) + " years left to retire.");
        Calendar now = Calendar.getInstance();
    System.out.println("Its " + (now.get(Calendar.YEAR)) + ", so you can retire in " +(now.get(Calendar.YEAR)+(b-a))+"." );

}

}
