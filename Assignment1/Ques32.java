class Test{
    public static void main(String args[]){
        int gardenSide = 150;
        int gradenArea = gardenSide*gardenSide;

        int poolSide = 25;
        int poolArea = poolSide * poolSide;

        int actualGardenArea = gradenArea - poolArea;
        System.out.println(actualGardenArea);
    }
}