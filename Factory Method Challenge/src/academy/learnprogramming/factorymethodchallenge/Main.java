package academy.learnprogramming.factorymethodchallenge;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        We are going to create an application that utilizes different types of animals (Duck and Tiger).

        Your goal for this assignment is to utilize the factory method design pattern for create of each type of animal.

        You should implement this pattern using the most common technique (using a class with a single factory method
        that takes a parameter to determine which object gets created).

        You should create an interface (product) that contains common method for each type of Animal (Duck and Tiger).
        The method could be something like walk or eat.

        You should create a subclass for each type of Animal (Duck and Tiger).
        Each class should implement the walk or eat method from the Animal Interface.
        The implementation could simply print out some info.

        You will need to create a concrete factory class with a factory method.
        This represents the create part of the pattern.
        You can name it whatever you want, but, I would suggest AnimalFactory for the class and
        getAnimalType for the factory method.
        The factory method should take a String object which determines the "correct" Animal subtype to create.
        This method should return an Animal interface reference.

        Lastly, create a demo class that includes a main method.
        This class will utilize the AnimalFactory to create a type of animal.
        After creating the Animal subtype which points to an Animal Reference.
        Invoke the walk or eat method to verify that the correct object was created.

        Example of a speak method.
        Output would include something like:
        "Duck says: Pack-pack"
        "Tiger says: Halum..Halum"
        */
        AnimalFactory animalFactory = new ConcreteFactory();

        Animal animal1 = animalFactory.getAnimalType("Duck");
        animal1.eat();
        animal1.walk();
        animal1.speak();

        Animal animal2 = animalFactory.getAnimalType("Tiger");
        animal2.eat();
        animal2.walk();
        animal2.speak();

        Animal animal3 = animalFactory.getAnimalType("Lion");
        animal3.eat();
        animal3.walk();
        animal3.speak();
    }
}
