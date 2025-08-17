import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter diameter");
        double dia = sc.nextDouble();
        double rad = dia/2;
        System.out.println("enter height");
        int h = sc.nextInt();
        double surfaceArea = 2*3.14* rad *(rad+h);
        System.out.println(surfaceArea);
    }
}
