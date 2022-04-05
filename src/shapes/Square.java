package shapes;

public class Square extends Rectangle{

    public Square(int side){
        super.length = side;//super keyword references parent Rectangle class length variable
        super.width = side;//references rectangle class width variable
        //super.width/length becomes the reference variable below as it is assigned value
    }

    public int getArea(){
        System.out.println("Your square area is: " + (super.length * super.width));
        return super.length * super.width;
    }

    public int getPerimeter(){
        System.out.println("Your square perimeter is: " + (4* super.length));
        return (4 * super.length);
    }


}
