/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator.world;

import becker.robots.City;
import becker.robots.Direction;


/**
 *
 * @author root
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        City ny = new City();

        Navigator navigator = new Navigator(ny);
        navigator.implement();

        City lv = new City();
        Climber climber = new Climber(lv);
        climber.implement();
        
        
    }
    
}
