package assignment9;

abstract class Shape1{
    abstract void area();

}
class Circle extends Shape1{
    double radius;

    public Circle(int i) {
        this.radius=i;
    }

    @Override
    void area() {
        System.out.println("Area of circle is:"+3.14*radius*radius);
    }
}
class Cylinder extends Circle{
    double radius;
    double height;

    public Cylinder(int i, int i1) {
        super(i);
        this.height = i1;
    }

    @Override
    void area() {
        System.out.println("Area of Cylinder is:"+(2 * Math.PI * radius * height + 2 * Math.PI * radius * radius));
    }
}
class Square extends Shape1{
    double side;

    public Square(int i) {
        this.side = i;
    }

    @Override
    void area() {
        System.out.println("Area of square is:"+side*side*side*side);
    }
}
class Rectangle1 extends Square{
    double length;
    double breadth;

    public Rectangle1(int i, int i1) {
        super(i);
        this.breadth = i1;
        this.length=i;
    }

    @Override
    void area() {
        System.out.println("Area of rectangle is:"+2*(length+breadth));
    }

}
public class Abstrat4 {
    public static void main(String[] args) {
        Shape1 shape[] = new Shape1[4];
        shape[0]=new Circle(34);
        shape[1]=new Square(4);
        shape[2]=new Cylinder(2,3);
        shape[3]=new Rectangle1(23,43);

        for (Shape1 shape1: shape) {
            shape1.area();
        }
        }
    }

/*
Area of circle is:3629.84
Area of square is:256.0
Area of Cylinder is:0.0
Area of rectangle is:132.0

Process finished with exit code 0

 */