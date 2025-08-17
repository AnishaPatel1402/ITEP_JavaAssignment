// 43) WAP to convert binary number into decimal number
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary number");
        int binary = sc.nextInt();
        int power2 = 1;    //2^0
        int decimal = 0;
        while(binary > 0){
            int lastD = (binary%10);
            decimal = decimal + (lastD * power2);
            power2 *= 2;
            binary /= 10;
        }
        System.out.println("In decimal = "+ decimal);
    }
}