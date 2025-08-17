//         A
//       A B
//     A B C
//   A B C D
// A B C D E  
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++)   System.out.print(" ");
            for(int j=1; j<=i; j++)    System.out.print((char)(64+j));
            System.out.println(); 
        }
    }
}