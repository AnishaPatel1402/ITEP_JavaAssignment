import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter perimeter: ");
        int p = sc.nextInt();
        System.out.println("enter length: ");
        int l = sc.nextInt();
        int b = p/2-l;
        int area = l*b;
        System.out.println("Breadth: "+ b);
        System.out.println("Area: "+ area);
    }
}