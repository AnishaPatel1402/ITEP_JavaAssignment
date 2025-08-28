// 16) Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.

import java.util.Scanner;
class Person{
    private String name;
    private int age;
    public Person(){
        age = 18;
    }
    public Person(int age){
        this.age = age;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name of person : "+ this.name);
        System.out.println("Age of person : "+ this.age);
    }
}
class Test{
    public static void main(String args[]){
        Person p1 = new Person();
        p1.setName("Anisha Patel");
        p1.display();
        
        Person p2 = new Person("Kashvee jaat", 22);
        p2.display();
    }
}
