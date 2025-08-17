import java.util.Scanner;
class Rectangle{
    private int length;
    private int width;

    //setter
    public void setData(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
       int area = length * width;
      System.out.println("Area = "+ area);
    }
}

class Test{
    public static void main(String args[]){
      Rectangle r = new Rectangle();
      r.setData(10,20);
      r.calculateArea();
    }
}