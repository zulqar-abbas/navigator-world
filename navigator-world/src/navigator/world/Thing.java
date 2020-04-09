/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator.world;

import becker.robots.City;
import becker.robots.Direction;
import java.awt.Color;

/**
 *
 * @author root
 */
public class Thing extends becker.robots.Thing{
        Thing(City ny, int i, int i0) {
        super(ny,i,i0);
        this.setColor(Color.BLACK);
    }
}
