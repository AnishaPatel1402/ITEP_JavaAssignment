//19. Write a Java program to replace a specified character with another character

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string  = ");
        String str = sc.next();
        System.out.print("enter char whom to repalce = ");
        char ch1 = sc.next().charAt(0);
        System.out.print("enter char repalce with = ");
        char ch2 =sc.next().charAt(0);

        String newStr = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch1) newStr += ch2;
            else newStr += str.charAt(i);
        }

        System.out.println("string before = "+ str);
        System.out.println("string after = "+ newStr);
        
    }
}