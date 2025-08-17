import java.util.Scanner;
class Test{
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before Swapping a : "+a+" b : "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping a : "+a+" b : "+b);

    }
}