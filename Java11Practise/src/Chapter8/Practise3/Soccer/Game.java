/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.Practise3.Soccer;

import Chapter8.Practise3.Utility.GameUtils;

/**
 *
 * @author jaden
 */
public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame(int maxGoals) {
        int numberOfGoals = (int)(Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);        
    }
    
    public void playGame(){
        playGame(6);
    }
 
    
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after "
            + currGoal.theTime + " mins by "
            + currGoal.thePlayer.playerName + " of "
            + currGoal.theTeam.teamName +
              "\n");
        }
        return returnString.toString();
    }
}
