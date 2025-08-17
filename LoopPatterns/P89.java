//      1               
//     101            
//    10101         
//   1010101           
//  101010101   
// 10101010101
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int space=1; space<=n-i; space++) System.out.print(" ");
            //0|1
            for(int j=1; j<=(2*i-1); j++){
                if(j%2!=0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }        
    }
}
