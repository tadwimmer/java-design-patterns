package academy.learnprogramming.factorymethodchallenge;

public class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("Tiger says: Halum..Halum");
    }

    @Override
    public void walk() {
        System.out.println("Tiger is walking");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }
}
