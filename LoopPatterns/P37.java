// *****
// ####
// ***
// ##
// *
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
              if(i%2!=0) {  //odd
                System.out.print("*");
              }else{    //even
                System.out.print("#");
              }
            }
            System.out.println();
        }
    }
}