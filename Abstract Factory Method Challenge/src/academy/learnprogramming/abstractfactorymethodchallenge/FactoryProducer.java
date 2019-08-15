package academy.learnprogramming.abstractfactorymethodchallenge;

class FactoryProducer {
    static IMovieFactory getFactory(String choice) {
        choice = choice.toLowerCase();
        if (choice.equalsIgnoreCase("action")) {
            return new ActionMovieFactory();
        } else if (choice.equalsIgnoreCase("comedy")) {
            return new ComedyMovieFactory();
        }
        return null;
    }
}
