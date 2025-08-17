import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //3) WAP to print sum of N natural number.  
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.print("Sum = "+ sum);
    }
}