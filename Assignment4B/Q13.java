import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        //print n to 1 in reverse order
        int i = n;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}