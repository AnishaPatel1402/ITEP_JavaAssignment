//Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.
class Airplane{
    private int flightNum;
    private String destination;
    private String departure;
    private boolean delay;
    public Airplane(int flightNum, String destination, String departure){
        this.flightNum = flightNum;
        this.destination = destination;
        this.departure = departure;
        this.delay = false;
    }
    public void delayFlight(){
        delay = true;
        System.out.println("Flight is delayed by 1 hour");
    }

    public void checkStatus(){
        if(delay){
            System.out.println("Flight number "+ this.flightNum +" is dealy by one hour" );
        }
        else{
            System.out.println("Your flight is on time No Delay");
        }
    }

    public void displayFlightDetails(){
        System.out.println("Flight number = "+ this.flightNum);
        System.out.println("Flight destination = "+ this.destination);
        System.out.println("Flight departure = "+ this.departure);
        System.out.println("is Flight delay = "+ this.delay);
    }
}
class Test{
    public static void main(String args[]){
        Airplane a = new Airplane(1234, "Mumbai", "12PM");
        a.displayFlightDetails();
        a.checkStatus();
        a.delayFlight();
        a.checkStatus();
        a.displayFlightDetails();
    }
}