import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //shelly's garden rectangular
        System.out.println("enter length of shelly's garden: ");
        int l1 = sc.nextInt();
        System.out.println("enter breadth of shelly's garden: ");
        int b1 = sc.nextInt();
        int areaShelly = l1*b1;

        //rachel's garden square
        System.out.println("enter side of rachel's garden: ");
        int a = sc.nextInt();
        int areaRachel = a*a;
        
        System.out.println("area of shelly's garden = "+ areaShelly);
        System.out.println("area of rachel's garden = "+ areaRachel);

        if(areaRachel > areaShelly) {
            System.out.println("Rachel's garden is bigger");
        }
        else{
            System.out.println("Shelly's gargen is bigger");
        }
       
    }
}