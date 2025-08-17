//Highest common factor
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();
        
        int i = (n1>n2) ? n2 : n1;
        int hcf = 1;
        while(i>1){
            if(n1%i==0 && n2%i==0){
                hcf = i;
                break;
            }
            else i--;
        }
        System.out.println("HCF = "+ hcf);
    }
}