//     A
//    AB
//   A_C
//  A__D
// ABCDE
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || i==n || i==j)    System.out.print((char)(64+j));
                else System.out.print("_");
            }
            System.out.println();
        }
    }
}

