// Find the Union of two sorted array.
import java.util.ArrayList;
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("enter "+ n1 + " elements of array 1");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("enter the size of array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("enter "+ n2 + " elements of array 2");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> union = new ArrayList<Integer>();
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
                i++;
            } 
            else {
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
                j++;
            }
        }

        while(i<n1) {
            union.add(arr1[i]);
            i++;
        }
        while(j<n2){
            union.add(arr2[j]);
            j++;
        }
        System.out.println("Union is : "+ union);
       
    }
}