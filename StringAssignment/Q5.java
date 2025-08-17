// WAP to find word of maximum length in given String.
// 	Sample Input: “Dear Student , You have need to work hard”
// 	Output: “Student”

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string  = ");
        String str = sc.nextLine();
        int len = str.length();

        int maxLen = -1;
        String maxWord = null;
        
        String word = "";
        for(int i=0; i<len; i++){
            if(str.charAt(i) != ' ') word += str.charAt(i);
            else {
                if(word.length() > maxLen) {
                    maxWord = word;
                    maxLen = word.length();
                }
                // System.out.println(word);
                word = "";
            }
        }
        // System.out.println(word);
        //compare last word 
        if(word.length() > maxLen) {
            maxWord = word;
            maxLen = word.length();
        }

        System.out.println("MaxWord = "+maxWord+" Maxlen = "+ maxLen);
    }
}