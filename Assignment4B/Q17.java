import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        int term = 1;
        // int i = 1;
        // while(i<=n){
        //     term = term + i - 1;
        //     System.out.println(term);
        //     i++;
        // }

        int i = 0;
        while(i<n){
            term = term + i;
            System.out.println(term);
            i++;
        }
    }
}