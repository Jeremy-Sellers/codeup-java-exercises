package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(){

    };

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        System.out.println("Your area is: " + (length * width));
        return length * width;
    }

    public int getPerimeter(){
        System.out.println("Your perimeter is: " + ((2*length) + (2*width)));
        return ((2*length) + (2*width));
    }
}
