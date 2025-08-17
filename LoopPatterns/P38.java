// 55555
// 4  4
// 3 3
// 22
// 1
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
              if(j==1|| i==n || i==j) {  
                System.out.print(i);
              }else{ 
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}