import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("Positive Number");
        }
        else if(n < 0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Neither negative nor positive");
        }
        
    }
}