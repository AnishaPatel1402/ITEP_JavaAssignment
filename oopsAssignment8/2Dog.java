class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void setDogName(String name){
        this.name = name;
    }

    public void setDogBreed(String breed){
        this.breed = breed;
    }

    public void print(){
        System.out.println("Dog Name = "+ this.name);
        System.out.println("Breed = "+ this.breed);
    }
}
class Test{
    public static void main(String args[]){
        Dog d1 = new Dog("Jojo", "German shepherd");
        Dog d2 = new Dog("Jugnu", "Bulldog");
        d1.print();
        d2.print();

        d1.setDogName("Jojo2");
        d1.setDogBreed("Golden Retriever");
        d1.print();

        d2.setDogName("Jugni");
        d2.setDogBreed("French Bulldog");
        d2.print();
    }
}