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
public class Course implements Serializable {
    
    private int time;
    private String name;
    Vector<Student> students = new Vector<>(0,1);
  
    public Course (String name,int time){
        this.time = time;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getTime(){
       return time; 
    }

    @Override
    public String toString() {
        return String.format("Course: %s Time %d", name, time);
    }
    
}
