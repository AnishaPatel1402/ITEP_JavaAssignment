// 13. Write a Java program to get the contents of a given string as a byte array
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string = ");
        String str = sc.nextLine();
        int len = str.length();

        byte byteArray[] = new byte[len];
        for(int i=0; i<len; i++){
            byteArray[i] = (byte) str.charAt(i);
        }
        
        for(byte b : byteArray){
            System.out.print(b+" ");
        }
    }
}