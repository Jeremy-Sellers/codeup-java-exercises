import java.util.Scanner;




public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiplication(1, 2));
//        System.out.println(division(1, 2));
//        System.out.println(remainder(5, 3));
//        System.out.println(getInteger(1,10));
//        System.out.println(factorial());
        System.out.println(dice());
    }

    //1
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static float division(float num1, float num2) {
        if (num2 == 0) {
            return 0;
        }
        return (num1 / num2);
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }
    //1

    //2
    public static int getInteger(int min, int max) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");

        int userNumber = userInput.nextInt();

        System.out.println("Your number is: " + userNumber);
        if (userNumber < min | userNumber > max) {
            System.out.println("That is not between 1 and 10 \nplease enter a number between 1 and 10");
            return userNumber;
        }
        System.out.println("Continue? yes or no");
        String userDecision = userInput.next();
        if (userDecision.equalsIgnoreCase("no")) {
            return userNumber;
        }
        return getInteger(1, 10);
    }
    //2

    //3
    public static long factorial() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        int userNumber = userInput.nextInt();
        if (userNumber < 1 | userNumber > 10) {
            System.out.println("That is not between 1 and 10");
        }
        long userNumberFactorial = 1;
        for (int i = 1; i <= userNumber; i++){
            userNumberFactorial *= i;
        }
        return userNumberFactorial;
    }
    //

    //4
    public static int dice(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of sides on dice");
        int diceSides = userInput.nextInt();
        System.out.println("Roll the dice!");
        int firstDice = (int) (Math.random() * diceSides);
        int secondDice = (int) (Math.random() * diceSides);
        System.out.println("your first roll was a " + firstDice);
        System.out.println("Your second roll was a " + secondDice);
        System.out.println("Would you like to play again? yes or no");
        String userResponse = userInput.next();
        if (userResponse.equalsIgnoreCase("yes")){
            return dice();
        }
        else{
            System.out.println("Your final dice roll was ");
        }
        return secondDice;
    }
    //

    //5

}


