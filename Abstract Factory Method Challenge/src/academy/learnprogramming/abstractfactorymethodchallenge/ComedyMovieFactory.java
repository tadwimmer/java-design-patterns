package academy.learnprogramming.abstractfactorymethodchallenge;

class ComedyMovieFactory extends IMovieFactory {
    @Override
    IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
