// Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
import java.util.ArrayList;
class Movie{
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;
    public Movie(String title, String director){
        this.title = title;
        this.director  = director;
        this.actors = new ArrayList<String>();
        this.reviews = new ArrayList<String>();
    }
    public void addReveiws(String review){
        this.reviews.add(review);
    }

    public void showReviews(){
        for(String r : reviews){
            System.out.println(r);
        }
    }

    public void addActor(String actor){
        this.actors.add(actor);
    }

    public void displayMovieDetails(){
        System.out.println("Movie Tittle = "+ this.title);
        System.out.println("Movie Director = "+ this.director);
        System.out.println("Movie actors = "+ this.actors);
        System.out.println("Movie reveiws = "+ this.reviews);
    }
}

class Test{
    public static void main(String args[]){
        Movie m = new Movie("SitaRam", "Idon'tKnow");
        m.addActor("Duqlur Salman");
        m.addActor("Murnal Thakur");
        m.addReveiws("Very nice movie");
        m.addReveiws("story telling is good");
        m.displayMovieDetails();
    }
}
