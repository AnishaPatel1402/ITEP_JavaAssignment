import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature");
        double temp = sc.nextDouble();
        System.out.println("enter choice c or C for celcius and f or F for fehrenheit conversion");
        char choice = sc.next().charAt(0);

        if(choice == 'C' || choice == 'c'){
            //fehrenheit to celcius
            double c = (temp - 32) * (5.0/9.0);
            System.out.println(temp + " in celcius is : " + c);
        }
        else if(choice == 'F' || choice == 'f'){
            //celcius to fehrenheit
            double f = (temp * 9.0/5.0) + 32;
            System.out.println(temp + " in fehrenheit is : " + f);
        }
        else {
            System.out.println("Wrong choice");
        }
        
    
        
    }
}