package dev.copc.solution;

import dev.copc.common.*;

public class SolutionConfiguration implements ISolutionConfiguration {

    @Override
    public String getTeamName() {
        return "Team Name";
    }

    @Override
    public Challenge getChallenge() {
        return Challenge.AlphaMath;
    }

    @Override
    public ChallengeLevel getChallengeLevel() {
        return ChallengeLevel.NonBeginner;
    }
}