/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class JTextFieldComponent {
    
    
    public static void main(String args[]){
        JFrame  jf = new JFrame("Uso de JTextField");
        jf.setSize(300,250);
        Container ct = jf.getContentPane();
        JTextField jt = new JTextField();
        ct.add(jt);        
        System.out.println(jt.getText());
        jf.setVisible(true);
        
        
        
        
    }
    
}
