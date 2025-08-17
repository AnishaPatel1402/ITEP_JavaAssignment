import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter area ");
        int area = sc.nextInt();
        System.out.println("enter height ");
        int height = sc.nextInt();

        float radius = area/(2*3.14*height);
        float dia = r*2;
        System.out.println(dia);
        
    }
}