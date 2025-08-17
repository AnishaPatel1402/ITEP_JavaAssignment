import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius: ");
        double r = sc.nextDouble();
        double area = 2 * 3.14 * r * r;
        System.out.println("area = "+ area);
    }
}