//     1
//    12
//   123
//  1234
// 12345

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
            for(int num=1; num<=i; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}