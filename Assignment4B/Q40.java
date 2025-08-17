//40) WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int temp = n;
        int odd = 0;
        int even = 0;
        while(temp > 0){
            int lastDigit = temp%10;
            if(lastDigit%2 == 0){
                even++;
            } else {
                odd++;
            }
            temp /= 10;
        }
        System.out.println("even digits = "+ even);
        System.out.println("odd digits = "+ odd);
    }
}