import java.util.Scanner;
public class chatBot {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How are you?");
        System.out.println("please type out your response!");
        System.out.print("Good");
        System.out.println("          Bad");
        String userResponse = userInput.next();
        if (userResponse.equalsIgnoreCase("good")) {
            System.out.println("Awesome, glad to hear it!");
        } else if (userResponse.equalsIgnoreCase("bad")) {
            System.out.println("Im sorry to hear that");
        }

    }
}
