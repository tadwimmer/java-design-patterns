package academy.learnprogramming.abstractfactorymethodchallenge;

abstract class IMovieFactory {
    abstract IHollywoodMovie getHollywoodMovie();

    abstract IBollywoodMovie getBollywoodMovie();
}
