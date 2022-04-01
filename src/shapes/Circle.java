package shapes;

import java.text.DecimalFormat;

public class Circle {
    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

public double getArea(){
    double area = ((this.radius) * (this.radius) * Math.PI);
    return area;
}

public double getCircumference(){
    double circumference = 2 * Math.PI * this.radius;
    return circumference;
}
}
