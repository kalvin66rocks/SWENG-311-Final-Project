/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng311_part2;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author kalvi_000
 */
public class Room implements Serializable  {
    
    private int number;
    Vector<Course> courses = new Vector<>(0,1);
    public Room(int room_number)
    {
        this.number = room_number;
    }
    
    public int get_number(){
        return number;
    }
    
}
