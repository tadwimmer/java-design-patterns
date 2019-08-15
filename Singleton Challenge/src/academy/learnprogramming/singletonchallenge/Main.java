package academy.learnprogramming.singletonchallenge;

public class Main {
    public static void main(String[] args) {
        /*
        Suppose you are a member of a cricket team.

        You are in a tournament and your team is going to play against another team.

        As pre the rules of the game, the captain of each side must go for a toss to
        decide which side will bat (or bowl) first.

        If your team does not have a captain, you need to elect someone as a captain first at the same time,
        your team cannot have more than one captain.

        Your goal for this challenge is to use the singleton design pattern to ensure that your team only has one captain.

        You are required to use the Bill Pugh Singleton Implementation approach to ensure only one captain is selected on your team.
        Use an inner static helper class to create your captain.

        Create a class that tests your implementation of the Single design pattern.
        Call your getInstance() method multiple times to retrieve objects.
        See if the objects are the same by using the == operator in Java.

        Example output:

        Trying to make a captain for our team
        New Captain selected for our team
        Trying to make another captain for our team
        You already have a Captain for your team. Send him for the toss.
        c1 and c2 are the same instance
        */
        System.out.println("Trying to make a captain for our team");
        MakeACaptain c1 = MakeACaptain.getCaptain();
        System.out.println("New Captain selected for our team");
        MakeACaptain c2 = MakeACaptain.getCaptain();

        if (MakeACaptain.getCaptain() != null) {
            System.out.println("You already have a Captain for your team. Send him for the toss.");
        }

        if (c1 == c2) {
            System.out.println("c1 and c2 are the same instance");
        } else {
            System.out.println("c1 and c2 are not the same instance");
        }
    }
}
