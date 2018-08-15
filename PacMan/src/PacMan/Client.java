package PacMan;

import java.net.*;
import java.io.*;
import java.awt.EventQueue;

public class Client {
    
    static Socket socket;
    public static void main(String[] args) throws Exception {
         socket = new Socket("localhost",7777);
         ObjectInputStream ooi=new ObjectInputStream(socket.getInputStream());
         EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    Pacman ex=(Pacman)(ooi.readObject());
                    
                    ex.setVisible(true);
                } catch (IOException ex1) {
                    System.out.println("IO Exception");
                } catch (ClassNotFoundException ex1) {
                    System.out.println("Class not found exception");
                }
            }
        });
    
    }
}
