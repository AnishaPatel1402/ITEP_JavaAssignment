// 13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
// init - to input radius from user
// calc - to calculate area
// display- to display area
import java.util.Scanner;
class Circle{
   private float radius;
   private float area;

   public void init(){
     Scanner sc = new Scanner(System.in);
     float radius;
     System.out.println("enter the radius of circle: ");
     radius = sc.nextFloat();
     this.radius = radius;
   }
   public void calcArea(){
        this.area = (float) (3.14 * radius * radius);
   }
   public void displayArea(){
        System.out.println("Area of circle with radius "+ radius + " is: "+ this.area);
   }

}
class Test{
    public static void main(String args[]){
        Circle c = new Circle();
        c.init();
        c.calcArea();
        c.displayArea();
    }
}
