import java.util.Scanner;
class Circle{
    private double radius;

    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void calculate(){
        double area = 3.14 * radius * radius;
        double circum = 2 * 3.14 * radius;
        System.out.println("Area of circle = "+ area);
        System.out.println("Circumference of circle = "+ circum);
    }

    public double getRadius(){
        return radius;
    }

}

class Test{
    public static void main(String args[]){
       Circle c = new Circle();
       c.setRadius(2.5);
       System.out.println("Radius of circle is = " + c.getRadius());
       c.calculate();
    }
}