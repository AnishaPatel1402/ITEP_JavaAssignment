import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = sc.nextInt();
        System.out.println("enter width: ");
        int width = sc.nextInt();
        int perimeter = 2*(length + width);
        System.out.println(perimeter);
    }
}