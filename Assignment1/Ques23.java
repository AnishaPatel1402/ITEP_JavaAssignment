class Test{
    public static void main(String args[]){
       //cube box dimensions
       int side = 3;
       int cubeVolume = side*side*side;

       //carton dimentsions
       int l = 15;
       int b = 9;
       int h = 12;
       int cartonVolume = l*b*h;

       int noOfBoxes = cartonVolume/cubeVolume;
       System.out.println(noOfBoxes);
    }
}