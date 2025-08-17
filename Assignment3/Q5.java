import java.util.Scanner;
class Test{
    //5.Take input of age of 3 people by user and determine oldest and youngest among them.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of 1st person");
        int age1 = sc.nextInt();
        System.out.println("enter age of 2nd person");
        int age2 = sc.nextInt();
        System.out.println("enter age of 3rd person");
        int age3 = sc.nextInt();

        //oldest
        if(age1 > age2){
            if(age1 > age3){
                System.out.println("1st person is the oldest");
            } 
            else {
                System.out.println("3rd person is the oldest");
            }
        }
        else{
            if(age2 > age3){
                System.out.println("2nd person is the olddest");
            }
            else {
                System.out.println("3rd person is the oldest");
            }
        }

        //youngest
        if(age1 < age2){
            if(age1 < age3){
                System.out.println("1st person is the Youngest");
            } 
            else {
                System.out.println("3rd person is the Youngest");
            }
        }
        else{
            if(age2 < age3){
                System.out.println("2nd person is the Youngest");
            }
            else {
                System.out.println("3rd person is the Youngest");
            }
        }
        
    }
}