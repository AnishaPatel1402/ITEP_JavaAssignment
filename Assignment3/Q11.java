import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your Gender M/F");
        char gender = sc.next().charAt(0);
        System.out.println("Are you married Y/N");
        char marital = sc.next().charAt(0);

        if(gender == 'F'){
            System.out.println("Work only in urban areas");
        }
        else if(gender == 'M' && (age>=20 && age<40)){
            System.out.println("Work anywhere");
        }
        else if(gender == 'M' && (age>=40 && age<=60)){
            System.out.println("Work only in urban areas");
        }
        else{
            System.out.println("Error!");
        }
    }
}