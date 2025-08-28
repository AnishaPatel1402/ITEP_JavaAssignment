// 19) Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
import java.util.Scanner;
import java.util.ArrayList;
class School{
    //taking input of 10 students
    ArrayList<Student> list = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    public void init(){
        for(int i=1; i<=10; i++){
            System.out.print("enter the name, rollno, age and score of student "+ i +" : ");
            String name = sc.next();
            int roll = sc.nextInt();
            int age = sc.nextInt();
            int score = sc.nextInt();
            Student s = new Student(name, roll, age, score);
            list.add(s);
        }
    }

    public void sortByGroup(){  //group [0-50], [50-65],[65-80],[80-100].
                                //group    A       B        C       D
        ArrayList<Student> grpA = new ArrayList<Student>();
        ArrayList<Student> grpB = new ArrayList<Student>();
        ArrayList<Student> grpC = new ArrayList<Student>();
        ArrayList<Student> grpD = new ArrayList<Student>();
        for(Student s: list){
            if(s.getScore() >= 0 && s.getScore() <= 50)   grpA.add(s);
            else if(s.getScore() > 50 && s.getScore() <= 65)    grpB.add(s);
            else if(s.getScore() > 65 && s.getScore() <= 80)    grpC.add(s);
            else if(s.getScore() > 80 && s.getScore() <= 100)    grpD.add(s);
        }
        
        System.out.println("\nGroup A: ");
        for(Student s : grpA) s.displayStudent();
        System.out.println();
        System.out.println("Group B: ");
        for(Student s : grpB) s.displayStudent();
        System.out.println();
        System.out.println("Group C: ");
        for(Student s : grpC) s.displayStudent();
        System.out.println();
        System.out.println("Group D: ");
        for(Student s : grpD) s.displayStudent();
        System.out.println();
    }

    public void displayAllStudents(){
        for(Student s : list){
            s.displayStudent();
        }
    }
}
class Student{
    private String name;
    private int rollno;
    private int age;
    private int score;

    public Student(String name, int rollno, int age, int score){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public void displayStudent(){
        System.out.println(this.name+" | "+this.rollno+" | "+this.age+" | "+this.score);
    }

}

class Test{
    public static void main(String args[]){
        School school = new School();
        school.init();
        school.displayAllStudents();
        school.sortByGroup();
    }
}