/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator.world;
import becker.robots.*;
import java.awt.Color;
/**
 *
 * @author root
 */
public class Climber {
    public Climber() {
    }
    
        public void implement(){
        
        // Set up the initial situation
        City ny = new City();
        Wall blockAve0 = new Wall(ny, 3, 2, Direction.WEST);
        Wall blockAve1 = new Wall(ny, 3, 2, Direction.NORTH);
        Wall blockAve2 = new Wall(ny, 2, 3, Direction.WEST);
        Wall blockAve3 = new Wall(ny, 1, 3, Direction.WEST);
        Wall blockAve4 = new Wall(ny, 1, 3, Direction.NORTH);
        Wall blockAve5 = new Wall(ny, 1, 3, Direction.EAST);
        Wall blockAve6 = new Wall(ny, 2, 4, Direction.NORTH);
        Wall blockAve7 = new Wall(ny, 2, 4, Direction.EAST);
        Wall blockAve8 = new Wall(ny, 3, 4, Direction.EAST);
        Robot navigator = new Robot(ny, 3, 0, Direction.EAST);
        Thing thing = new Thing(ny,3,1);
        // navigator goes around the walls with the following lines of code
            
        //move the navigator 1 step ahead per move()
        navigator.move();
        
        
        if(navigator.canPickThing()){
            navigator.pickThing();
        }

        //turn the navigator 90 degree to the south
        navigator.turnLeft();

        //move the navigator 1 step ahead per move()
        navigator.move();

        //turn the navigator 90 degree to the east
        navigator.turnLeft();
        navigator.turnLeft();
        navigator.turnLeft();

        //move the navigator 1 step ahead per move()
        navigator.move();

        //turn the navigator 90 degree to the north
        navigator.turnLeft();

        //move the navigator 1 step ahead per move()
        navigator.move();
        navigator.move();

       //turn the navigator 90 degree to the west
        navigator.turnLeft();
        navigator.turnLeft();
        navigator.turnLeft();

        //stop at the starting position per move()
        navigator.move();    
        
        navigator.putThing();
        
        //move the navigator 1 step ahead per move()
        navigator.move();
        
        //turn the navigator 90 degree to the west
        navigator.turnLeft();
        navigator.turnLeft();
        navigator.turnLeft();
        
        navigator.move();
        
        navigator.turnLeft();
        
        navigator.move();
        
        navigator.turnLeft();
        navigator.turnLeft();
        navigator.turnLeft();
        
        navigator.move();
        navigator.move();
        
        navigator.turnLeft();
        

    }

}
