package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades = new ArrayList<>();//

    public Student(String studentName){
        this.studentName = studentName;
    }

    // returns the student's name
    public String getName(){
        return studentName;
    };

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        System.out.println("Your grade is: " + grade);
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int totalGrades = 0;
        for (int i = 0; i < grades.size(); i++){
            totalGrades += grades.get(i);
        }
        return totalGrades/grades.size();
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("James");
        firstStudent.addGrade(90);
        firstStudent.addGrade(70);
        firstStudent.addGrade(80);

        System.out.println(firstStudent.grades);
        System.out.println(firstStudent.getGradeAverage());
    }
}
