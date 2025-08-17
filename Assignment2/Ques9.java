import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = sc.nextInt();
        double area = Math.sqrt(3)/4 * length * length;
        System.out.println("area = " + area);
       
    }
}