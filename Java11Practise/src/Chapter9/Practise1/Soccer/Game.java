/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.Practise1.Soccer;

import Chapter9.Practise1.Utility.GameUtils;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author jaden
 */
public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    public void playGame(int maxGoals) {
        /* Practice 8-2. Add code to initialize the array currGame.goals to a random size */
        int numberOfGoals = (int)(Math.random() * maxGoals + 1);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);        
    }
    
    public void playGame() {
        playGame(6);
    }
    
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.getGoals()) {
            returnString.append("Goal scored after "
            + currGoal.getTheTime() + " mins by "
            + currGoal.getThePlayer().getPlayerName() + " of "
            + currGoal.getTheTeam().getTeamName() +
              "\n");
        }
        return returnString.toString();
    }

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        Chapter9.Practise1.Soccer.Team oldHomeTeam = this.homeTeam;
        this.homeTeam = homeTeam;
        propertyChangeSupport.firePropertyChange(PROP_HOMETEAM, oldHomeTeam, homeTeam);
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        Chapter9.Practise1.Soccer.Team oldAwayTeam = this.awayTeam;
        this.awayTeam = awayTeam;
        propertyChangeSupport.firePropertyChange(PROP_AWAYTEAM, oldAwayTeam, awayTeam);
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        Chapter9.Practise1.Soccer.Goal[] oldGoals = this.goals;
        this.goals = goals;
        propertyChangeSupport.firePropertyChange(PROP_GOALS, oldGoals, goals);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_HOMETEAM = "homeTeam";
    public static final String PROP_AWAYTEAM = "awayTeam";
    public static final String PROP_GOALS = "goals";
}
