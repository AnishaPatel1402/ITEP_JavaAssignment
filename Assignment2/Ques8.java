import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height: ");
        int height = sc.nextInt();
        System.out.println("enter area: ");
        double area = sc.nextDouble();
        area = area * 10000;
        double base = (2*area)/height;

        System.out.println("base = " + base);
       
    }
}