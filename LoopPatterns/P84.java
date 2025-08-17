//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            //number part 1
            for(int num=i; num >= 1; num--){
                System.out.print(num);
            }
            //number part 2
            for(int num = 2; num <= i; num++){
                System.out.print(num);
            }
            System.out.println();
        }
     

        
    }
}