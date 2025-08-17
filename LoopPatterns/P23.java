// a
// bc
// d f
// g  j
// klmno

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        char a = 'a';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==j || i==n || j==1) System.out.print(a + " ");
                else System.out.print(" ");
                a++;
            }
            System.out.println();
        }
    }
}
