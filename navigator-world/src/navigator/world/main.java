/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator.world;


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
        Navigator navigator = new Navigator();
        navigator.implement();
        
        Climber climber = new Climber();
        climber.implement();
        
        
    }
    
}