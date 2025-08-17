import java.util.Scanner;
class Rectangle{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    //setter
    public void setData(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int calculateArea(){
       int area = length * width;
       return area;
    }
    public int calculatePerimeter(){
        int peri = 2*(length+width);
        return peri;
    }
}

class Test{
    public static void main(String args[]){
      Rectangle r = new Rectangle(10,30);
      System.out.println("Area = "+ r.calculateArea());
      System.out.println("Perimeter = "+ r.calculatePerimeter());
    }
}