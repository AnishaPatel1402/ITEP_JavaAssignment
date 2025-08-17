import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = sc.nextInt();
        int number;
        for(int i=1; i<=n; i++){
            if(i%2!=0) number = 1;  //odd row
            else number = 0; //even row
            for(int j=1; j<=i; j++){
                System.out.print(number);
                if(number==1) number = 0;
                else number = 1;
            }
            System.out.println();
        }
    }
}