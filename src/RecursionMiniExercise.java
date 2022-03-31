import java.util.Scanner;

public class RecursionMiniExercise {
    public static void main(String[] args){
//        System.out.println(countTo100(1));
        System.out.println(addNums(10));
    }
    // TODO: use recursion to print out a given number up through 100
     public static int countTo100(int num) {
         System.out.println(num);
         if (num == 100) {
             return 1;
         }
         else{
             return countTo100(num + 1);
         }
     }


    // TODO: use recursion to add all numbers up from 1 to a given number
     public static int addNums(int num) {
        if (num == 1){
             return 1;
         }
         return num + addNums(num - 1);
     }
}

