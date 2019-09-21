/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class Formularios {
    
    public static void main(String args[]){        
        JFrame frame = new JFrame("Minha primeira aplicação");
        Container cont = frame.getContentPane();
        cont.setBackground(Color.PINK);        
        frame.setSize(350,250);
        frame.setTitle("Janela - S2");        
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Isto é um rótulo"));
        frame.add(new JButton("Clique aqui"));
        frame.add(new JTextField("Digite alguma coisa aqui:"));
        frame.setLocation(1024/2, 600/2);
        frame.setVisible(true);       
        
    }
    
}
