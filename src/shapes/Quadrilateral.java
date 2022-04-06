package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(){

    }

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        System.out.println("Your length is: " + this.length);
        return this.length;
    }

    public double getWidth(){
        System.out.println("Your width is: " + this.width);
        return this.width;
    }
    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
