/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.Practise2.Soccer;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author jaden
 */
public class Player {
    
    private String playerName;
    
    /* Practice 9-2. Add the constructor here */

    public Player(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
}
