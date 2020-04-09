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
public class Robot extends becker.robots.Robot{

    Robot(City ny, int i, int i0, Direction direction) {
        super(ny,i,i0,direction);
        this.setColor(Color.BLACK);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }
    
    //this piece of code turn the robot right because the right operation can be
    //performed by turning the robot 3 time left.
    public void turnRight(){
        super.turnLeft();
        super.turnLeft();
        super.turnLeft();
    }
    
    //this piece of code move the robot i setps forward and the i is passed
    //from where the function is calling
    public void moveForward(int i){
        for (int j = 0; j < i; j++) {
            this.move();
        }
    }
}
