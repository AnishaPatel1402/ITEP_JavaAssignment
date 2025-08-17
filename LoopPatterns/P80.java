//    *
//   *_*
//  *_*_*
// *_*_*_*
//  *_*_*
//   *_*
//    *  
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row: ");
        int n = sc.nextInt();
        
        //first part
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            //star
            for(int j=1; j<=2*i-1; j++){
                if(j%2==0)  System.out.print("_"); 
                else  System.out.print("*");
            }
            System.out.println();
        }

        //second part
        for(int i=n-1; i>=1; i--){
            //space
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            //star
            for(int j=1; j<=2*i-1; j++){
                if(j%2==0)  System.out.print("_"); 
                else  System.out.print("*");
            }
            System.out.println();
        }
    }
}