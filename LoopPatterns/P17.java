import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0) System.out.print("*"); //odd row
                else System.out.print("#"); //even row
            }
            System.out.println();
        }
    }
}