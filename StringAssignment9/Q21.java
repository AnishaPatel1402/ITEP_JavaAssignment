// 21. Write a Java program to check whether a given string starts with the contents of another string

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string 1 = ");
        String s1 = sc.nextLine();
        System.out.print("enter string 2 = ");
        String s2 = sc.next();
        int len1 = s1.length();
        int len2 = s2.length();

        //get the substring from 0 to len2
        System.out.print(s1.substring(0,len2));

        int end = len2;
        String s = "";
        for(int i=0; i<len2; i++){
            s += s1.charAt(i);
        }

        if(s.equals(s2))System.out.println(s1 + " -is start with- "+ s2);
        else   System.out.println(s1 + " -does not start with- "+ s2);
      
    }
}