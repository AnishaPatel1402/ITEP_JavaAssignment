class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("Name = "+ this.name);
        System.out.println("Age = "+ this.age);
    }
}
class Test{
    public static void main(String args[]){
        Person p1 = new Person("Anisha Patel", 20);
        Person p2 = new Person("Kashvee Jaat", 5);
        p1.print();
        p2.print();
    }
}