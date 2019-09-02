package dev.copc.solution;

import static java.lang.System.out;

public class App 
{
    public static void main( String[] args )
    {
        // TODO: Put some test code here to test your solution on your local machine.
        var solution = new ChallengeSolution();

        var problem = "";

        var results = solution.getChallengeSolutions(problem);

        for(var r : results)
        {
            out.println(r);
        }
    }
}
