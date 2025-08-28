//1. Write a Java program to concatenate Two strings
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string 1 = ");
        String s1 = sc.next();
        System.out.print("enter string 2 = ");
        String s2 = sc.next();

        String newString = s1.concat(s2);
        System.out.println("concatenate string is = "+ newString);
    }
}