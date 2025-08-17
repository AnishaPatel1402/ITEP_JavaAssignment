import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base ratio: ");
        int baseRatio = sc.nextInt();
        System.out.println("enter height ratio: ");
        int heightRatio = sc.nextInt();
        System.out.println("enter area: ");
        int area = sc.nextInt();
        
        double ratio = Math.sqrt((2*area)/(baseRatio*heightRatio));

        double actualBase = baseRatio * ratio;
        double actualHeight = heightRatio * ratio;

        System.out.println("Ratio = "+ ratio);
        System.out.println("Base = "+ actualBase);
        System.out.println("Height = "+ actualHeight);
    }
}