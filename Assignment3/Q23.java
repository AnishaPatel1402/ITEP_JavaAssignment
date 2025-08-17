import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        
    }
}