import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        double radius = sc.nextDouble();
        System.out.println("enter height");
        int height = sc.nextInt();
        double surfaceArea = 2 * 3.14 * radius * (radius + height);
        System.out.println(surfaceArea);
    }
}