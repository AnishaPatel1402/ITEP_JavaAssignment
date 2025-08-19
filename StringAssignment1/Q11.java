// 11. Write a Java program to check whether a given string ends with the contents of another string

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

        //get the substring from (len1-len2) to end of s1 (len1)
        // System.out.print(s1.substring(len1-len2));

        int start = len1-len2;
        String s = "";
        for(int i=start; i<len1; i++){
            s += s1.charAt(i);
        }

        if(s.equals(s2))System.out.println(s1 + " -is ends with- "+ s2);
        else   System.out.println(s1 + " -does not ends with- "+ s2);
      
    }
}