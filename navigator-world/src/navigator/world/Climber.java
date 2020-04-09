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
public class Climber extends Thing {
    public City ny;
    public Robot rb;
    
    Climber(City ny) {
        super(ny, 3,1);
        this.ny = ny;
         // Set up the initial situation
        Wall blockAve0 = new Wall(ny, 3, 2, Direction.WEST);
        Wall blockAve1 = new Wall(ny, 3, 2, Direction.NORTH);
        Wall blockAve2 = new Wall(ny, 2, 3, Direction.WEST);
        Wall blockAve3 = new Wall(ny, 1, 3, Direction.WEST);
        Wall blockAve4 = new Wall(ny, 1, 3, Direction.NORTH);
        Wall blockAve5 = new Wall(ny, 1, 3, Direction.EAST);
        Wall blockAve6 = new Wall(ny, 2, 4, Direction.NORTH);
        Wall blockAve7 = new Wall(ny, 2, 4, Direction.EAST);
        Wall blockAve8 = new Wall(ny, 3, 4, Direction.EAST);
        this.rb = new Robot(ny, 3, 0, Direction.EAST);
        
    }

        public void implement(){
        
        // navigator goes around the walls with the following lines of code
            
        //move the navigator 1 step ahead per move()
        this.rb.move();
        
        
        if(this.rb.canPickThing()){
            this.rb.pickThing();
        }

        //turn the rb 90 degree to the south
        this.rb.turnLeft();

        //move the navigator 1 step ahead per move()
        this.rb.move();

        //turn the navigator 90 degree to the east
        this.rb.turnLeft();
        this.rb.turnLeft();
        this.rb.turnLeft();

        //move the navigator 1 step ahead per move()
        this.rb.move();

        //turn the navigator 90 degree to the north
        this.rb.turnLeft();

        //move the navigator 1 step ahead per move()
        this.rb.move();
        this.rb.move();

       //turn the navigator 90 degree to the west
        this.rb.turnLeft();
        this.rb.turnLeft();
        this.rb.turnLeft();

        //stop at the starting position per move()
        this.rb.move();    
        
        this.rb.putThing();
        
        //move the navigator 1 step ahead per move()
        this.rb.move();
        
        //turn the navigator 90 degree to the west
        this.rb.turnLeft();
        this.rb.turnLeft();
        this.rb.turnLeft();
        
        this.rb.move();
        
        this.rb.turnLeft();
        
        this.rb.move();
        
        this.rb.turnLeft();
        this.rb.turnLeft();
        this.rb.turnLeft();
        
        this.rb.move();
        this.rb.move();
        
        this.rb.turnLeft();
    }

}
