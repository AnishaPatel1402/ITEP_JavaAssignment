import java.util.Scanner;
class Test{
    // 3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
    // Ask user for their salary and year of service and print the net bonus amount.

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        double salary = sc.nextDouble();
        System.out.println("enter year of service");
        int year = sc.nextInt();

        if(year > 5){
            double bonus = salary * 5/100;
            System.out.println("Your bonus = "+ bonus);
        }
        else {
            System.out.println("your year of service is less than 5");
        }
    }
}