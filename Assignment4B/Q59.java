//59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=100; i<=200; i++){
            if(i%9==0) sum += i;
        }
        System.out.println(sum);
    }
}