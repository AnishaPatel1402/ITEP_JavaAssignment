class Test{
    public static void main(String args[]){
        int volume = 1287;
        int radius = 10;
        double h = volume/(3.14*radius*radius);
        double surfaceArea = 2*3.14*radius*(h+radius);
        System.out.println(surfaceArea);
    }
}