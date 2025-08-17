import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = sc.nextInt(); 
        System.out.println("enter breadth: ");
        int breadth = sc.nextInt(); 

        double area = length*breadth;
        System.out.println("area = "+ area);
    }
}