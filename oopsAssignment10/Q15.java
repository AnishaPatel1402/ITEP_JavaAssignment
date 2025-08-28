// 15) Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
// two integers
// three float
// all elements of array
// one double and one integer

import java.util.Scanner;
class MathOperation{
    public void multiply(int x, int y){
        int result = x * y;
        System.out.println("Multiply of "+x+ " and "+ y + " is: " + result);
    }

    public void multiply(float x, float y, float z){
        float result = x * y * z;
        System.out.println("Multiply of "+ x + ", " + y + " and " + z + " is: " + result);
    }

    public void multiply(int arr[]){
        int result = 1;
        for(int ele : arr) result *= ele;
        System.out.println("Multiply of array = "+ result);
    }

    public void multiply(double x, int y){
        double result = x * y;
        System.out.println("Multiply of "+x+ " and "+ y + " is: " + result);
    }

}
class Test{
    public static void main(String args[]){
        MathOperation m = new MathOperation();
        m.multiply(5,4);
        m.multiply(1.2f, 3.4f, 5.6f);
        int arr[] = {1,2,3,4,5};
        m.multiply(arr);
        m.multiply(4.5, 10);
        
    }
}