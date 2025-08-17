import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.println("enter number 3 : ");
        int n3 = sc.nextInt();

        if(n1 > n2 && n1>n3) System.out.println("first number is greater");
        else if(n2 > n1 && n2>n3) System.out.println("second number is greater");
        else System.out.println("third number is greater");
    }
}