import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        System.out.println("enter number 3");
        int c = sc.nextInt();
        System.out.println("enter number 4");
        int d = sc.nextInt();
        
        if(a<b && a<c && a<d) System.out.println("first number is lowest");
        else if(b<a && b<c && b<d) System.out.println("second number is lowest");
        else if(c<a && c<b && c<d) System.out.println("third number is lowest");
        else System.out.println("fourth number is lowest");
        
    }
}