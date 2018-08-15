package PacMan;

import static PacMan.Client.socket;
import java.io.*;
import java.net.*;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Server extends JFrame {
    
    
    
    public static void main(String[] args) throws Exception {
        
    ServerSocket serversocket =  new  ServerSocket(7777);
    Socket socket = serversocket.accept();
    Pacman ex = new Pacman();
    ex.setVisible(true);
    ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
    oos.writeObject(ex);
                
    
        
    }
    
    
    
    
}
