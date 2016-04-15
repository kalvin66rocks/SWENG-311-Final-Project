/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng311_part2;

import java.util.Vector;
import javax.swing.JFrame;

/**
 *
 * @author kalvi_000
 */
public class SWENG311_part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Student> students = new Vector<>(1, 1);
        Vector<Room> rooms = new Vector<>(1, 1);
        
        //create a new jframe that holds the main menu
        Main_Menu frame = new Main_Menu();
        //terminate on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the default size of the frame
        //frame.setSize(500, 500);
        //make the frame visible
        frame.setVisible(true);
    }
    
}
