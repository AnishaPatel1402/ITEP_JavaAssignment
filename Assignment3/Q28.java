import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        System.out.println("enter arithmetic operator");
        char op = sc.next().charAt(0);
        
        switch(op){
            case '+': System.out.println("Addition = "+ (a+b));
            break;
            case '-': System.out.println("Subtraction = "+ (a-b));
            break;
            case '*': System.out.println("Multiplication = "+ (a*b));
            break;
            case '/': System.out.println("Division = "+ (a/b));
            break;
            case '%': System.out.println("Modulus = "+ (a%b));
            break;
            default: System.out.println("Wrong operator");
        }
      
        
    }
}