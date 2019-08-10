package academy.learnprogramming.factorymethodchallenge;

class ConcreteFactory extends AnimalFactory {
    @Override
    public Animal getAnimalType(String type) throws Exception {
        type = type.toLowerCase();
        switch (type) {
            case "duck":
                return new Duck();
            case "tiger":
                return new Tiger();
            default:
                throw new Exception("Animal type: " + type + " cannot be instantiated");
        }
    }
}
