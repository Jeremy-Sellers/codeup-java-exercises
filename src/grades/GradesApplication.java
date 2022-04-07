package grades;

import grades.Student;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {

    public static void outputStudentInfo(String userResponse,HashMap<String, Student> students  ){
        if (students.containsKey(userResponse)) {
            System.out.printf("Name: %s - Github Username: %s%n", students.get(userResponse).getName(),userResponse);
            System.out.printf("Current Average: %.2f%n",students.get(userResponse).getGradeAverage());
        }
        else{
            System.out.println("No username found.");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student firstStudent = new Student("Jack");
        firstStudent.addGrade(90);
        firstStudent.addGrade(80);
        firstStudent.addGrade(85);
        System.out.println(firstStudent.getGrades());
        System.out.println(firstStudent.getGradeAverage());
        students.put("Jackman", firstStudent);

        Student secondStudent = new Student("Jill");
        secondStudent.addGrade(95);
        secondStudent.addGrade(85);
        secondStudent.addGrade(100);
        System.out.println(secondStudent.getGrades());
        System.out.println(secondStudent.getGradeAverage());
        students.put("JillVal", secondStudent);


        Student thirdStudent = new Student("Andy");
        thirdStudent.addGrade(65);
        thirdStudent.addGrade(80);
        thirdStudent.addGrade(85);
        System.out.println(thirdStudent.getGrades());
        System.out.println(thirdStudent.getGradeAverage());
        students.put("HandyAndy", thirdStudent);

        Student fourthStudent = new Student("Tom");
        fourthStudent.addGrade(80);
        fourthStudent.addGrade(90);
        fourthStudent.addGrade(90);
        System.out.println(fourthStudent.getGrades());
        System.out.println(fourthStudent.getGradeAverage());
        students.put("TomAto", fourthStudent);



        System.out.println("Welcome! \nHere are the Github userNames:");

        Set<String> gitHubUserNames = students.keySet();
        for (String gitHubUserName : gitHubUserNames) {
            System.out.printf("|%s|", gitHubUserName);
        }

//        System.out.println("|  " + firstStudent.getName() +
//                "  |  " + secondStudent.getName() +
//                "  |  " + thirdStudent.getName() +
//                "  |  " + fourthStudent.getName() + "  |  ");

        System.out.println("\nWhat user would you like to see information for?");
        String userResponse = userInput.nextLine();

        outputStudentInfo(userResponse,students);

        while(true){
            System.out.println("Would you like to search another student? yes or no");
            String userChoice = userInput.nextLine();
            if (userChoice.equalsIgnoreCase("no")){
                System.out.println("Have a nice day!");
                break;
            }else{
                System.out.println("Please choose a student");
                userResponse = userInput.nextLine();
                outputStudentInfo(userResponse,students);
            }
        }
    }
}