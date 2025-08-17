import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("enter number 2 : ");
        int n2 = sc.nextInt();

         System.out.println("before: ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        //using third variable
        // int n3 = n1;
        // n1 = n2;
        // n2 = n3;

        //without using third variable | using arithmetic operator
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After: ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

    }
}