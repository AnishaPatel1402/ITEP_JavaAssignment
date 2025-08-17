import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of english");
        int english = sc.nextInt();
        System.out.println("enter marks of Hindi");
        int hindi = sc.nextInt();
        System.out.println("enter marks of Maths");
        int maths = sc.nextInt();
        System.out.println("enter marks of physics");
        int physics = sc.nextInt();
        System.out.println("enter marks of chemistry");
        int chemistry = sc.nextInt();

        int totalSum = english + hindi + maths + physics + chemistry;
        double percetage = totalSum/5.0;
        System.out.println("your percentage = " + percetage);
    }
}