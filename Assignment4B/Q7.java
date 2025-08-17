import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //7) WAP to check whether entered number is prime or not.
        System.out.println("enter a numeber n : ");
        int n = sc.nextInt();
        // int factor = 0;
        // int i=1;
        // while(i<=n){
        //     if(n%i==0) factor++;
        //     i++;
        // } 
        // if(factor == 2){
        //     System.out.println("Prime number");
        // }else{
        //     System.out.println("Not Prime number");
        // }


        //using boolean value
        boolean status = true;
        int i=2;
        while(i<=n/2){
            if(n%i==0){
                status = false;
                break;
            }
        }
        if(status && n != 1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}