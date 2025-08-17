import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int r = sc.nextInt();
        System.out.println("enter height");
        int h = sc.nextInt();
        double volume = pi * r * r * h;
        System.out.println(volume);
    }
}