package academy.learnprogramming.abstractfactorymethodchallenge;

class ActionMovieFactory extends IMovieFactory {
    @Override
    IHollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
