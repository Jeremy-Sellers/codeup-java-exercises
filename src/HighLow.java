import java.util.Scanner;
public class HighLow{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int randomNumber = (int) (Math.random()*100);
        System.out.println(randomNumber);
        System.out.println("Guess what number was picked between 0 and 100!");
        int userGuess = userInput.nextInt();
        while(userGuess != randomNumber) {
            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
                System.out.println("Guess again!");
                userGuess = userInput.nextInt();
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
                System.out.println("Guess again!");
                userGuess = userInput.nextInt();
            }
        }
        System.out.println("GOOD GUESS!");
    }
}
