// a
// bc
// def
// ghij
// klmno
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        char ch = 'a';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
        
    }
}
