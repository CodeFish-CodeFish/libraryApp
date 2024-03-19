package task1;

public class Donkey extends Animal{

    public Donkey(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Ia Ia");
    }

    public  void donkeyMethod(){
        System.out.println("DonkeyMethod");
    }
}
