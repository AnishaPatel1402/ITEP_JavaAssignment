//8. Write a Java program to test if a given string contains the specified sequence of char values
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string = ");
        String str = sc.nextLine();
        System.out.print("enter characters = ");
        String chars = sc.next();
        int len = chars.length();

        int i = 0;
        boolean isfound = false;
        while(i<=str.length()-len){
            String s = str.substring(i, i+len);
            // System.out.println(s + " "+ i);
            if(s.equals(chars)==true){
                System.out.println(str+" contains "+ chars);
                isfound = true;
                break;
            }
            i++;
        }
        if(isfound==false) System.out.println(str+" not contains "+ chars);
      
    }
}