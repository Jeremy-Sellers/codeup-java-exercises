package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width){
        super.length = length;
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Your Perimeter is: " + ((2*length) + (2*width)));
        return ((2*length) + (2*width));
    }

    @Override
    public double getArea() {
        System.out.println("Your area is: " + (length * width));
        return (length * width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public void setWidth(double width) {
        this.width = width;

    }
//    protected int length;
//    protected int width;
//    public Rectangle(){
//    };
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//    public int getArea(){
//        System.out.println("Your area is: " + (length * width));
//        return length * width;
//    }
//    public int getPerimeter(){
//        System.out.println("Your perimeter is: " + ((2*length) + (2*width)));
//        return ((2*length) + (2*width));
//    }
}
