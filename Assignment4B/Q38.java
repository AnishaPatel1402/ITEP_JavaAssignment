import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //Armstrong number

        int count = 0;
        int temp = n;
        while(temp > 0){
            count++;
            temp = temp/10;
        }
        
        temp = n;
        int armstrongSum = 0;
        while(temp>0){
            armstrongSum += Math.pow((temp%10), count);
            temp /= 10;
        }
        System.out.println(armstrongSum);
        if(n==armstrongSum){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not a Armstrong number");
        }
    }
}