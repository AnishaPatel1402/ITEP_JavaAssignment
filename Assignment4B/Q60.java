//60) WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("Number\tSquare\tCube\tSquareRoot");
        for(int i=1; i<=n; i++){
           System.out.println(i+"\t"+(int)Math.pow(i,2)+"\t"+(int)Math.pow(i,3)+"\t"+Math.sqrt(i));
        }

    }
}   