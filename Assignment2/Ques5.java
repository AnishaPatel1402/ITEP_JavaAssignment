import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost: ");
        int cost = sc.nextInt();
        System.out.println("enter rate: ");
        int rate = sc.nextInt();
        System.out.println("enter length: ");
        int l = sc.nextInt();
        int peri = cost/rate;
        int b = peri/2-l;
        int area  = l*b;
        System.out.println("Breadth: "+ b);
        System.out.println("Area: "+ area);
         System.out.println("perimeter: "+ peri);
    }
}