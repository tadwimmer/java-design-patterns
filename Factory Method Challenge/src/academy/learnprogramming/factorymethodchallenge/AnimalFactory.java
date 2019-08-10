package academy.learnprogramming.factorymethodchallenge;

public abstract class AnimalFactory {
    public abstract Animal getAnimalType(String type) throws Exception;
}
