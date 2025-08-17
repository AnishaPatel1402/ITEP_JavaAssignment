import java.util.Scanner;
class Test{
    /*
    7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
       Take following input from user
       Number of classes held
       Number of classes attended.
       And print
       percentage of class attended
       Is student is allowed to sit in exam or not.          
    */

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of classes held");
        double totalClass = sc.nextInt();
        System.out.println("enter number of classes attended");
        double classAttend = sc.nextInt();

        double percentage = (classAttend/totalClass)*100.0;
        System.out.println("Your attedence percentage = "+ percentage);

        if(percentage>=75){
            System.out.print("You are eligible to sit in exam");
        }
        else{
            System.out.print("You are NOT eligible to sit in exam");
        }
    }
}