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

        
        // for(int i=0; i<n; i++){
        //     int count = 0;
        //     for(int j=0; j<n; j++){
        //         if(array[i]==array[j]) count++;
        //     }
        //     System.out.println("occurence of " + array[i] + " is = " + count);
        // }

        int max = -1;
        for(int i=0; i<n; i++){
            if(array[i] > max) max = array[i];
        }
        int occurence[] = new int [max+1];
        for(int i=0; i<n; i++){
            occurence[array[i]]++;
        }

        for(int i=0; i<=max; i++){
            System.out.println("occurence of " + i +" is: " +occurence[i]+ " ");
        }
    }
}     