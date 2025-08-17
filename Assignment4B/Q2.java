import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //2) WAP to print N natural number.  
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        
    }
}