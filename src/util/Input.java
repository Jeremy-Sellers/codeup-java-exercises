package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
//    scanner = new Scanner(System.in);

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        System.out.println("Enter name: ");
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
        int userInt = scanner.nextInt();
        while(userInt > max | userInt < min){
            System.out.println("Please enter a valid number");
            userInt = scanner.nextInt();
        }
        return userInt;
    }

    int getInt(){
        System.out.println("What's your favorite number?");
        return scanner.nextInt();
    }

    double getDouble(double min, double max){
        System.out.println("Enter a large number larger than " + min + " but less than " + max);
        double userDouble = scanner.nextDouble();
        while(userDouble > max | userDouble < min){
            System.out.println("Please enter a valid number");
            userDouble = scanner.nextDouble();
        }
        return userDouble;
    }

    public double getDouble(){
        System.out.println("Please enter a number");
        return scanner.nextDouble();
    }




}

