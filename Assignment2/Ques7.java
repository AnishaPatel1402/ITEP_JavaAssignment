import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base: ");
        int base = sc.nextInt();
        System.out.println("enter area: ");
        int area = sc.nextInt();
        int height = (2*area)/base;
        System.out.println("height = " + height);
       
    }
}