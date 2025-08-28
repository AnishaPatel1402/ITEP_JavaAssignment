// 14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R

import java.util.Scanner;
class MathOperation{
    private int x;
    private int y;
    private int result;

    public void init(){
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("enter value of x: ");
        x = sc.nextInt();
        System.out.println("enter value of y: ");
        y = sc.nextInt();
        
        this.x = x;
        this.y = y;
    }

    public int add(){
        result = x+y;
        return result;
    }

    public int multiply(){
        result = x*y;
        return result;
    }
   
    public int power(){
        return (int) Math.pow(x,y);
    }

    public void display(){
        System.out.println("Addition : "+ add());
        System.out.println("Multiply : "+ multiply());
        System.out.println("power : "+ power());
    }

}
class Test{
    public static void main(String args[]){
        MathOperation m = new MathOperation();
        m.init();
        m.display();
        
    }
}

