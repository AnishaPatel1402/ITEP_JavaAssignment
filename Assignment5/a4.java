//4. WAP to find an element in array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int array[] = new int [n];
        for(int i=0; i<n; i++){
            System.out.println("enter the element "+ (i+1));
            array[i] = sc.nextInt();
        }

        System.out.print("enter element to be find = ");
        int ele = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(ele == array[i]){
                System.out.print(ele + " found at index = "+ i);
                flag = true;
                break;
            }
        }
        if(flag==false) System.out.print("Element not found");
    }
}