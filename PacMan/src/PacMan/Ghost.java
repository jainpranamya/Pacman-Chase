/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacMan;


import java.awt.EventQueue;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author user
 **/

public class Ghost extends JFrame {
    public static void main(String[] args) throws Exception {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Ghost ghost = new Ghost ();
                ghost.setVisible(true);
               
                
                
            }
        });
    }
}  

