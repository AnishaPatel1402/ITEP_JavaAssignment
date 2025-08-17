import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1: ");
        int a = sc.nextInt();
        System.out.println("enter side 2: ");
        int b = sc.nextInt();
        System.out.println("enter perimeter: ");
        int perimeter = sc.nextInt();

        int c = perimeter-a-b;
        int s = perimeter/2;

        int area = s*(s-a)*(s-b)*(s-c);
        area = (int) Math.sqrt(area);
        System.out.println("c = "+ c);
        System.out.println("perimeter = "+ perimeter);
        System.out.println("area = "+ area);
        
    }
}