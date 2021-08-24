/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.Practise1.Soccer;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author jaden
 */
public class Goal {
    public Team getTheTeam() {
        return theTeam;
    }

    /**
     * @param theTeam the theTeam to set
     */
    public void setTheTeam(Team theTeam) {
        Chapter9.Practise1.Soccer.Team oldTheTeam = this.theTeam;
        this.theTeam = theTeam;
        propertyChangeSupport.firePropertyChange(PROP_THETEAM, oldTheTeam, theTeam);
    }

    /**
     * @return the thePlayer
     */
    public Player getThePlayer() {
        return thePlayer;
    }

    /**
     * @param thePlayer the thePlayer to set
     */
    public void setThePlayer(Player thePlayer) {
        Chapter9.Practise1.Soccer.Player oldThePlayer = this.thePlayer;
        this.thePlayer = thePlayer;
        propertyChangeSupport.firePropertyChange(PROP_THEPLAYER, oldThePlayer, thePlayer);
    }

    /**
     * @return the theTime
     */
    public double getTheTime() {
        return theTime;
    }

    /**
     * @param theTime the theTime to set
     */
    public void setTheTime(double theTime) {
        double oldTheTime = this.theTime;
        this.theTime = theTime;
        propertyChangeSupport.firePropertyChange(PROP_THETIME, oldTheTime, theTime);
    }
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_THETEAM = "theTeam";
    public static final String PROP_THEPLAYER = "thePlayer";
    public static final String PROP_THETIME = "theTime";
    private Team theTeam;
    private Player thePlayer;
    private double theTime;
}
