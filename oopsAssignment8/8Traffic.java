// Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.
class TrafficLight{
    private String color;
    private int duration;
    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }
    public void changeColor(String color){
        this.color = color;
    }
    public boolean isRed(){
        if(color.equals("Red")) return true;
        else return false;
    }
    public boolean isGreen(){
        if(color.equals("Green")) return true;
        else return false;
    }
    public void displayTrafficLight(){
        System.out.println("Light = "+ this.color+"| duration = "+ this.duration);
    }
}
class Test{
    public static void main(String args[]){
        TrafficLight t1 = new TrafficLight("Red", 60);
        t1.displayTrafficLight();
        System.out.println(t1.isRed());
        System.out.println(t1.isGreen());
    }
}