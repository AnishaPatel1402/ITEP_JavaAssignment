import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter volume ");
        int volume = sc.nextInt();
        System.out.println("enter radius ");
        int radius = sc.nextInt();
        float h = volume/3.14*radius*radius;
        float surface_area = 2*3.14*radius*(h+radius);
        System.out.println(surface_area);
        
    }
}