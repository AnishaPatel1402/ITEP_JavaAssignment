import java.util.Scanner;
class Test{
    // 6. Write a program to print absolute vlaue of a number entered by user. E.g.-
    // INPUT: 1        OUTPUT: 1
    // INPUT: -1        OUTPUT: 1
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n<1) n = n * (-1);
        System.out.println("n = "+ n);
    }
}