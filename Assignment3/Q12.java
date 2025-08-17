import java.util.Scanner;
class Test{
    // 12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
    // INPUT : 1234        OUTPUT : 4321
    // INPUT : 5982        OUTPUT : 2895 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a four digit number ");
        int n = sc.nextInt();
        System.out.println("Number = "+ n);
        //take individual digits
        int ones = n%10;
        n = n/10;
        int tens = n%10;
        n = n/10;
        int hund = n%10;
        n = n/10;
        int thous = n%10;

        int reverse =  ones*1000 + tens*100 + hund*10 + thous;
        System.out.println("Reverse number = "+ reverse);
        
    }
}