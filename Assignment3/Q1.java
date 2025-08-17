import java.util.Scanner;
class Test{
    //1. Take values of length and breadth of a rectangle from user and check if it is square or not.

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int length = sc.nextInt();
        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        if(length==breadth) 
            System.out.println("It is a Square");
        else
            System.out.println("It is not a Square");

    }
}