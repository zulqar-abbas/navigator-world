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

    public void move() {
        super.move();
    }

    public void turnLeft() {
        super.turnLeft();
    }
    
}
