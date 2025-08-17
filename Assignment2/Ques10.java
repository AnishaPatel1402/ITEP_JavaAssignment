import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side: ");
        int side = sc.nextInt();
        double area = (side * side)/2;
        System.out.println("area = " + area);
       
    }
}