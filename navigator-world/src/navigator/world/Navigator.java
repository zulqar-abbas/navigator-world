/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator.world;

import becker.robots.*;
/**
 *
 * @author root
 */
public class Navigator {
    
    public void implement(){
        
        // Set up the initial situation
        City ny = new City();
        Wall blockAve0 = new Wall(ny, 1, 1, Direction.WEST);
        Wall blockAve1 = new Wall(ny, 2, 1, Direction.WEST);
        Wall blockAve2 = new Wall(ny, 1, 1, Direction.NORTH);
        Wall blockAve3 = new Wall(ny, 1, 2, Direction.NORTH);
        Wall blockAve4 = new Wall(ny, 1, 2, Direction.EAST);
        Wall blockAve5 = new Wall(ny, 2, 2, Direction.EAST);
        Wall blockAve6 = new Wall(ny, 2, 1, Direction.SOUTH);
        Wall blockAve7 = new Wall(ny, 2, 2, Direction.SOUTH);
        Robot navigator = new Robot(ny, 0, 2, Direction.WEST);

        // navigator goes around the walls with the following lines of code

        //move the navigator 1 step ahead per move()
        navigator.move();
        navigator.move();

        //turn the navigator 90 degree to the south
        navigator.turnLeft();

        //move the navigator 1 step ahead per move()
        navigator.move();
        navigator.move();
        navigator.move();

        //turn the navigator 90 degree to the east
        navigator.turnLeft();

        //move the navigator 1 step ahead per move()
        navigator.move();
        navigator.move();
        navigator.move();

        //turn the navigator 90 degree to the north
        navigator.turnLeft();

        //move the navigator 1 step ahead per move()
        navigator.move();
        navigator.move();
        navigator.move();

       //turn the navigator 90 degree to the west
        navigator.turnLeft();

        //stop at the starting position per move()
        navigator.move();    
    }

}
