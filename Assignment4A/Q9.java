import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms: ");
        int n = sc.nextInt();
        int i = 1;
        double sum = 0;
        while(i<=n){
            sum += 1.0/i;
            System.out.print(1+"/"+i+" ");
            i++;
        }
       System.out.println("\nSum = "+ sum);
    }
}
