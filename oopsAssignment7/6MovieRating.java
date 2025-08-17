import java.util.Scanner;
class MovieRating{
    private String name;
    private String genre;
    private double rating;

    //setter
    public void setData(String name, String genre, double rating){
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    //display;
    public void display(){
        System.out.println("Movie Name = "+ this.name);
        System.out.println("Genre = "+ this.genre);
        System.out.println("Rating = "+ this.rating);
    }

    public boolean isHit(){
        if(this.rating >=8.0) return true;
        else return false;
    }
}

class Test{
    public static void main(String args[]){
       MovieRating m = new MovieRating();
       m.setData("Mahaavatar Narsimha", "Epic Animation", 9.5);
       m.display();
       System.out.println("Is Mahaavatar Narsimha Hit = "+ m.isHit());
       
    }
}