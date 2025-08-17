import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        if(n==0) System.out.println("Zero");
        else{
            int rem = n%2;
            switch(rem){
                case 0: System.out.println("Even");
                break;
                case 1: System.out.println("Odd");
                break;
            }
        }
    }
}