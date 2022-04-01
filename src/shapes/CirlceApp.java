package shapes;


import util.Input;

public class CirlceApp {
    public static void main(String[] args) {
        Input newInput = new Input();
        System.out.println("Input the radius of your circle!");
        Circle firstRadius = new Circle(newInput.getDouble());
        System.out.println("The radius of your circle is " + firstRadius.getArea());
        System.out.println("The circumference of your circle is " + firstRadius.getCircumference());


    }
}
