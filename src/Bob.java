import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        //Bobs responses
        String questionResponse = "Sure";
        String yellingResponse = "Whoa, chill out!";
        String emptyResponse = "Fine. Be that way!";
        String otherResponse = "Whatever";
        //Bobs responses

        //initial question
        System.out.println("Would you like to talk to Bob? Yes or no");
        //initial question

        //initial user response
        String userResponse = userInput.nextLine();
        //initial user response

        //loop to talk to bob with ability to exit anytime
        while(userResponse.equalsIgnoreCase("yes")){
            System.out.println("Awesome! Let's talk to Bob!");
            String userTalking = userInput.nextLine();
            if(userTalking.endsWith("?")){
                System.out.println(questionResponse);
            }else if(userTalking.endsWith("!")){
                System.out.println(yellingResponse);
            }else if(userTalking.length() == 0){
                System.out.println(emptyResponse);
            }else{
                System.out.println(otherResponse);
            }
            System.out.println("Would you still like to talk to Bob?");
            userResponse = userInput.nextLine();
        }
        //Response if user no longer wants to talk to bob
        System.out.println("Okay maybe next time!");
        //Response if user no longer wants to talk to bob

    }
}
