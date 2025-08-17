import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number n: ");
        int n = sc.nextInt();
        //print odd number up to n
        int i=1;
        while(i<=n){
            if(i%2!=0) System.out.println(i);
            i++;
        }
    }
}