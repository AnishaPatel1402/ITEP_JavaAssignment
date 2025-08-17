// A
// AB
// A C
// A  D
// ABCDE

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==j || i==n || j==1) System.out.print((char)(64+j));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
