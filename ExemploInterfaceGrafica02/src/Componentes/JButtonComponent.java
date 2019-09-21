/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Danilo
 */
public class JButtonComponent {
    
    public static void main (String args[]){
          JFrame jf = new JFrame();
          jf.setSize(400,300);
          Container ct = jf.getContentPane();
          JButton jb = new JButton("Clique aqui!");
          ct.add(jb);
          jf.setVisible(true);
          
    }
    
}
