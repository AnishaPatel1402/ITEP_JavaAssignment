//     5
//    44
//   333
//  2222
// 11111

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
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
}
