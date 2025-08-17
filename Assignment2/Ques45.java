import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first term");
        int a1 = sc.nextInt();
        System.out.println("enter second term");
        int a2 = sc.nextInt();

        int commonDiff = a2-a1;
        System.out.println("enter n");
        int n = sc.nextInt();

        int sumOfTerms = (n/2)*(2*a1+(n-1)*commonDiff);
        System.out.println(sumOfTerms);
        
    }
}