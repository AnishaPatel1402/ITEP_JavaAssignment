import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int l = sc.nextInt();
        System.out.println("enter breadth: ");
        int b = sc.nextInt();
        int area = l*b;
        int totalCost = area/100*6;
        System.out.println("Total cost : "+ totalCost);
    }
}