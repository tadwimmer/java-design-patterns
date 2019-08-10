package academy.learnprogramming.factorymethodchallenge;

public class Duck implements Animal {
    @Override
    public void speak() {
        System.out.println("Duck says: Pack-pack");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }
}
