import java.util.Scanner;
class StudentResult{
    private String name;
    private double mathMark;
    private double scienceMark;
    private double EnglishMark;

    //setter
    public void setData(String name, double mathMark, double scienceMark, double EnglishMark){
        this.name = name;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.EnglishMark = EnglishMark;
    }

    //display;
    public void display(){
        System.out.println("Student Name = "+ this.name);
        System.out.println("Maths mark = "+ this.mathMark);
        System.out.println("Science mark = "+ this.scienceMark);
        System.out.println("English mark = "+ this.EnglishMark);
    }

   public double average(){
        double avg = (mathMark+scienceMark+EnglishMark)/3.0;
        return avg;
   }
}

class Test{
    public static void main(String args[]){
       StudentResult s = new StudentResult();
       s.setData("Shivay Patel",90, 75, 80);
       s.display();
       System.out.println("Average = "+ s.average());
    }
}