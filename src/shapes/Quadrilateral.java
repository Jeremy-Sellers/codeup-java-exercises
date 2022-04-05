package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(){

    }

    public int getLength(){
        System.out.println("Your length is: " + this.length);
        return this.length;
    }

    public int getWidth(){
        System.out.println("Your width is: " + this.width);
        return this.width;
    }
    abstract int setLength();
    abstract int setWidth();
}
