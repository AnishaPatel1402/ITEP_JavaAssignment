import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        //  -6 -3 0 3 6 9 

        // int i = -n; 
        // while(i<=n){
        //     System.out.println(i);
        //     i=i+3;
        // }
        
        int i=1;
        int term = n/2 * (-3);
        while(i<=n){
            System.out.print(term +  " ");
            term += 3;
            i++;
        }
        
    }
}