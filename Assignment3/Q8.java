import java.util.Scanner;
class Test{
    //8. Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you have any medical cause (Y - Yes and N - No)");
        char ans = sc.next().charAt(0);
        if(ans == 'Y'){
            System.out.println("Not Allowed to sit");
        }
        else{
            System.out.println("Allowed to sit");
        }
    }
}