import java.util.Scanner;
class Test{
    //print 0 1 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        int i=1;
        while(i<=n-2){
            int sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
            i++;
        }

    }
}
