class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display(){
        System.out.println("Hours = "+ this.hour +" | Minutes = "+ this.minute +" | Seconds = "+ this.second);
    }

    public Time add(Time t2){
        Time t = new Time();
        t.hour = this.hour + t2.hour;
        t.minute = this.minute + t2.minute;
        t.second = this.second + t2.second;

        if(t.second >= 60){
            t.minute += (t.second/60);
            t.second %= 60;
        }
        if(t.minute >= 60){
            t.hour += (t.minute/60);
            t.minute %= 60;
        }
        return t;
    }

}

class Test{
    public static void main(String args[]){
        Time t1 = new Time(5,45,20);
        Time t2 = new Time(7,35,14);
        Time totalTime = t1.add(t2);
        totalTime.display();
    }
}