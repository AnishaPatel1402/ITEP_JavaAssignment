import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hypotenuse: ");
        int h = sc.nextInt();
        System.out.println("enter base: ");
        int b = sc.nextInt();
        
        int height = (int) Math.sqrt(h*h - b*b);
        int area = (b*height)/2;

        System.out.println("area = "+ area);
        System.out.println("height = "+ height);
        
    }
}