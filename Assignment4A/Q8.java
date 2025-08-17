import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //print 1 2 2 4 8........
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms: ");
        int n = sc.nextInt();
        int first = 1;
        int second = 2;
        System.out.print(first + " " + second + " ");
        int i=1;
        while(i<=n-2){
            int product = first * second;
            System.out.print(product + " ");
            first = second;
            second = product;
            i++;
        }
    }
}
