//     1
//     2
//     3
//     4
// 123454321
//     4
//     3
//     2
//     1
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a odd row: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==(n/2+1)) System.out.print(j);
                else if(j==(n/2+1)) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }        
    }
}