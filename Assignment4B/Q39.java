import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //strong number
        int temp = n;
        int factorialSum = 0;
        while(temp > 0){
            int lastDigit = temp%10;
            int fact = 1;
            for(int i=1; i<=lastDigit; i++){
                fact *= i;
            }
            factorialSum += fact;
            temp /= 10;
        }
        if(factorialSum == n){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong number");
        }
    }
}