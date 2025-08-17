import java.util.Scanner;
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle = "+ area);
    }

    public void calculateCircum(){
        double circum = 2 * 3.14 * radius;
        System.out.println("Circumference of circle = "+ circum);
    }

    public double getRadius(){
        return radius;
    }

}

class Test{
    public static void main(String args[]){
       Circle c = new Circle(2.5);
    //    c.setRadius(2.5);
       System.out.println("Radius of circle is = " + c.getRadius());
       c.calculateArea();
       c.calculateCircum();
    }
}