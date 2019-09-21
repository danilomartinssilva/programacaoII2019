
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class JTextAreaComponent {
    
    public static void  main (String args[]){        
        JFrame frame = new JFrame("TextAREA");
        frame.setSize(300,300);
        Container ct = frame.getContentPane();
        JTextArea jtxa = new JTextArea();
        ct.add(jtxa);
        frame.setVisible(true);
    }
    
}
