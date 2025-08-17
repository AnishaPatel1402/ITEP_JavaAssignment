// z y x w v u--- b c a	…… n terms 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // char alphabet = 'z';
        // int i=1;
        // while(i<=n){
        //     System.out.print(alphabet+" ");
        //     alphabet--;
        //     i++;
        // }

        for(char i = 'z'; n!=0; n--){
            System.out.print(i+"\t");
            i--;
        }
    }
}