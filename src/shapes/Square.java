package shapes;

public class Square extends Quadrilateral{
    public Square(int side){
        super.length = side;
        super.width = side;

    }

    @Override
    public double getPerimeter() {
        System.out.println("Your Perimeter is: " + ((2 * length)+(2 * width)));
        return ((2 * length)+(2 * width));
    }

    @Override
    public double getArea() {
        System.out.println("Your area is: " + (length * width));
        return (length * width);
    }

    @Override
    public int setLength() {
        return this.length;
    }

    @Override
    public int setWidth() {
        return this.width;
    }

//    public Square(int side){
//        super.length = side;//super keyword references parent Rectangle class length variable
//        super.width = side;//references rectangle class width variable
//        //super.width/length becomes the reference variable below as it is assigned value
//    }
//
//    public int getArea(){
//        System.out.println("Your square area is: " + (super.length * super.width));
//        return super.length * super.width;
//    }
//
//    public int getPerimeter(){
//        System.out.println("Your square perimeter is: " + (4* super.length));
//        return (4 * super.length);
//    }


}
