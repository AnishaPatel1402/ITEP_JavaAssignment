// A
// BCD
// EFGHI
// JKLMNOP
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=1; i<=n; i++){
           for(int j=1; j<=2*i-1; j++){
                System.out.print(ch++);
           }
            System.out.println();
        }
    }
}
