package task1;

public abstract class Animal {
    protected String name;
    //constructor Animal must be created with name - initialize a name
    //method abstract makeSound();
    //getter for name non abstract

    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();

    public String getName(){
        return name;
    }
}
