import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1: ");
        int a = sc.nextInt();
        System.out.println("enter side 2: ");
        int b = sc.nextInt();
        System.out.println("enter diagonal length: ");
        int diagonal = sc.nextInt();

        int area1 = (a*diagonal)/2;
        int area2 = (b*diagonal)/2;

        int totalarea = area1+area2;
        System.out.println(totalarea);
        
    }
}