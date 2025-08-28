// 22. Write a Java program to get a substring of a given string between two specified positions
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string = ");
        String str = sc.nextLine();
        int len = str.length();
        System.out.print("enter start position = ");
        int start = sc.nextInt();

        System.out.print("enter end position = ");
        int end = sc.nextInt();

        String subStr = "";
        for(int i=start; i<end; i++){
            subStr += str.charAt(i);
        }
        System.out.println("Substring is = "+ subStr);
    }
}