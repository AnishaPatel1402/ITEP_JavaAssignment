import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();

        //perfect number between n1 and n2
        int i = n1;
        while(i<=n2){
            int sumOfDivisor = 0;
            int j;
            for(j=1; j<i; j++){
                if(i%j==0){
                    sumOfDivisor += j;
                }
            }
            if(sumOfDivisor==j) System.out.print(j+" ");
            i++;
        }
        
    }
}