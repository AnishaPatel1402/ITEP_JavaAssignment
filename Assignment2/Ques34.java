import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base1");
        double base1 = sc.nextDouble();
        double base2 = sc.nextDouble();
        double height = sc.nextDouble();
        double walk = sc.nextDouble();
        
        double height2 = height+walk;

        double area = 0.5 * (base1+base2)*height+2;
        System.out.println(area);
    }
}