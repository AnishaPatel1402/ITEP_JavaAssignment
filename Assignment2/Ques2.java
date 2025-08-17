import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter area: ");
        int area = sc.nextInt();
        System.out.println("enter breadth: ");
        int b = sc.nextInt();
        int l = area/b;
        int perimeter = 2*(l+b);
        System.out.println("length: "+ l);
        System.out.println("perimeter: "+ perimeter);
    }
}