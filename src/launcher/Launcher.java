package launcher;

import java.awt.*;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
    public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Student juanrapino = new Student(117149,"Rapino","Juan Ignacio","juanirapino@hotmail.com","https://github.com/RapinoJuan","/images/foto.png");
                SimplePresentationScreen s = new SimplePresentationScreen(juanrapino);
                s.setVisible(true);
            }
        });
    }
}