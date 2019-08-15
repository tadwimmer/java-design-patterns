package academy.learnprogramming.abstractfactorymethodchallenge;

public class Main {

    public static void main(String[] args) {
        /*
        We are going to create an application that utilizes different types of movies (HollywoodMovie and BollywoodMovie,
        our products) which have different genre's (comedy or action).

        Your goal for this assignment is to utilize the abstract factory method design pattern for creation of each type
        of movie with the correct Genre. So, our factory will create either action or comedy movies of a certain family
        of products (Hollywood or Bollywood).

        You should implement this pattern using any technique you want (a static method for the creator, parameter passing
        to determine which type to create, etc). The following slides suggest only one way to implement.
        This is by no means, the only way. The suggested solution on the following slides heavily uses interfaces and
        subtypes in the main class.

        You should create two movie interfaces (Hollywood and Bollywood) that contain a common method, the method could
        be something like getting the movie name.

        You should create a concrete class for each genre of movie (HollywoodComedyMovie, HollywoodActionMovie,
        BollywoodComedyMovie, BollywoodActionMovie) that implements the correct interface above.
        The implementation could simply print out some hard-coded name.

        You will need to create another interface for the Abstract factory pattern (creators).
        This class will create a family of products (either Hollywood/Bollywood action movies or Hollywood/Bollywood comedy movies).
        I would suggest IMovieFactory for the interface name and getHollyWoodMovie and getBollyWoodMovie for the factory
        methods (these methods will return a reference to either an IHollywoodMovie or an IBollyWoodMovie).

        You will also need to create classes that implement the factory methods from the IMovieFactory interface.
        ComedyMovieFactory and ActionMovieFactory are good names.
        The factory method should take a String object which determines the "correct" IMovie subtype to create.
        This method should return an IHollyWoodMovie or IBollyWoodMovie interface reference as mentioned in the previous slide.

        Lastly, create a demo class that includes a main method.
        This class will utilize the Comedy and Action movie factories to create a family of products
        (either Hollywood/Bollywood action movies or Hollywood/Bollywood comedy movies).
        Invoke the getMovieName method to verify that the correct object was created.

        Example output:

        Action movies are:
        Kranti is a Hollywood Action Movie
        Bang Bang is a Bollywood Action Movie

        Comedy movies are:
        Basanata Bilap is a Hollywood Comedy Movie
        Munna Bhai M.B.B.S. is a Bollywood Comedy Movie
        */
        IMovieFactory actionMovieFactory = FactoryProducer.getFactory("Action");

        System.out.println("Action movies are:");

        IHollywoodMovie hwMovie1 = actionMovieFactory.getHollywoodMovie();
        IBollywoodMovie bwMovie1 = actionMovieFactory.getBollywoodMovie();

        System.out.println(hwMovie1.getMovieName());
        System.out.println(bwMovie1.getMovieName());

        IMovieFactory comedyMovieFactory = FactoryProducer.getFactory("Comedy");

        System.out.println("\nComedy movies are:");

        IHollywoodMovie hwMovie2 = comedyMovieFactory.getHollywoodMovie();
        IBollywoodMovie bwMovie2 = comedyMovieFactory.getBollywoodMovie();

        System.out.println(hwMovie2.getMovieName());
        System.out.println(bwMovie2.getMovieName());
    }
}
