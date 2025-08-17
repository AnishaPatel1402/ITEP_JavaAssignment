import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private double price;

    //setter
    public void setData(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //display;
    public void display(){
        System.out.println("Title = "+ this.title);
        System.out.println("Author Name = "+ this.author);
        System.out.println("Price = "+ this.price);
    }
}

class Test{
    public static void main(String args[]){
       Book b = new Book();
       b.setData("Atomic Habits", "James Clear", 120.50);
       b.display();
    }
}