package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Animal> zoo = new ArrayList<>();
        Donkey donkey1 = new Donkey("Dradonkey");//pure donkey
        Animal donkey2 = new Donkey("DragonDonkey2");

        Lion lion1 = new Lion("Alex");
        Animal lion2 = new Lion("Alex2");

        zoo.add(lion2);
        zoo.add(lion1);
        zoo.add(donkey1);
        zoo.add(donkey2);

        donkey1.donkeyMethod(); // donkey method


        zoo.add(new Lion("Leo"));
        zoo.add(new Donkey("Donkey"));

//        zoo.add();
        //add one lion
        //add one donkey

        //in the forloop please make all the animal Making Noise


        for (Animal animal:zoo ) {
            animal.makeSound();
        }

    }
}
