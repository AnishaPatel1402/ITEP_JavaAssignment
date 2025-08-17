import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //4) WAP to print table of a number.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  number: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+ i +" = "+ (n*i));
        }  
    }
}