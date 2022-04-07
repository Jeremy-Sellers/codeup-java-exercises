package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
//    scanner = new Scanner(System.in);

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        return scanner.nextLine();
    }

    boolean yesNo(){
        System.out.println("Yes or no");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        }else{
            return false;
        }
    }

    int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        String userInt = getString();
        try{
        while(Integer.valueOf(userInt) > max | Integer.valueOf(userInt) < min){
            System.out.println("Please enter a valid number");
            userInt = getString();
        }
            System.out.println("Your number: " + userInt + " is within the range.");
        return Integer.valueOf(userInt);
        }
        catch (NumberFormatException NFE){
            System.out.println("An error of " + NFE + " occured");
            return getInt(min,max);
        }
    }

    int getInt(){
        System.out.println("What's your favorite number?");
        String userInput = getString();
        try{
        System.out.println("Your number is " + Integer.valueOf(userInput));
        return Integer.valueOf(userInput);
    }
        catch (NumberFormatException NFE){
            System.out.println("An error of " + NFE + " occurred");
            return getInt();
        }
    }

    double getDouble(double min, double max){
        System.out.println("Enter a number larger than " + min + " but less than " + max);
        String userDouble = getString();
        try{
        while(Integer.valueOf(userDouble) > max | Integer.valueOf(userDouble) < min){
            System.out.println("Please enter a valid number");
            userDouble = getString();
        }
        System.out.println("Your number: " + userDouble + " is within range.");
        return Integer.valueOf(userDouble);
        }catch (NumberFormatException NFE){
            System.out.println("An error of type " + NFE + " occurred");
            return getDouble(min,max);
        }
    }

    public double getDouble(){
        System.out.println("Please enter a number");
        String userNumber = getString();
        try{
            System.out.println("Your entered number " + Integer.valueOf(userNumber));
            return Integer.valueOf(userNumber);
        }
        catch (NumberFormatException NFE){
            System.out.println("An error of type " + NFE + " occurred");
            return getDouble();
        }
    }

    public static void main(String[] args) {
        Input newInput = new Input();
//        newInput.getString();
//        newInput.getInt(5,10);
        newInput.getDouble(2,8);
    }
}

