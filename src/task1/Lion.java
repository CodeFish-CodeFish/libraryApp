package task1;

public class Lion extends Animal{

    public Lion(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Rourh rourh!");
    }
}
