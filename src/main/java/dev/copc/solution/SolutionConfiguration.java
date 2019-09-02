package dev.copc.solution;

import dev.copc.common.*;

public class SolutionConfiguration implements ISolutionConfiguration {

    @Override
    public String getTeamName() {
        return "Team Name";        // TODO: Return your team's "friendly" name here. This will show on the leaderboard.
    }

    @Override
    public Challenge getChallenge() {
        return Challenge.AlphaMath; // TODO: Return the Challenge that this solution is for.
    }

    @Override
    public ChallengeLevel getChallengeLevel() {
        return ChallengeLevel.NonBeginner;  // TODO: Return the level at which you're competing.
    }
}