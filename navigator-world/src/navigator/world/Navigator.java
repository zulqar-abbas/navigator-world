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
    public City ny;
    public Robot rb;

    Navigator(City ny)
    {
        this.ny = ny;
        this.rb = new Robot(ny, 0, 2, Direction.WEST);
        // Set up the initial situation
        Wall blockAve0 = new Wall(ny, 1, 1, Direction.WEST);
        Wall blockAve1 = new Wall(ny, 2, 1, Direction.WEST);
        Wall blockAve2 = new Wall(ny, 1, 1, Direction.NORTH);
        Wall blockAve3 = new Wall(ny, 1, 2, Direction.NORTH);
        Wall blockAve4 = new Wall(ny, 1, 2, Direction.EAST);
        Wall blockAve5 = new Wall(ny, 2, 2, Direction.EAST);
        Wall blockAve6 = new Wall(ny, 2, 1, Direction.SOUTH);
        Wall blockAve7 = new Wall(ny, 2, 2, Direction.SOUTH);
    }
    
    public void implement(){
        
        //this will create the robot which will navigate through the city

        // navigator goes around the walls with the following lines of code

        //move the navigator 2 steps
        this.rb.moveForward(2);

        //turn the navigator 90 degree to the south
        this.rb.turnLeft();

        this.rb.moveForward(3);

        this.rb.turnLeft();

        this.rb.moveForward(3);

        this.rb.turnLeft();

        this.rb.moveForward(3);
       //turn the navigator 90 degree to the west
        this.rb.turnLeft();

        //stop at the starting position per move()
        this.rb.moveForward(1);    
    }

}
