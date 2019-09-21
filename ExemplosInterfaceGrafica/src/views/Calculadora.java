/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class Calculadora {
    static private  JButton jb1,jb2,jb3,jb4;
    static private  JTextField jtx1,jtx2,jtx3;
    
 
 public static void main (String[] args){
     
     JFrame frame = new JFrame("Calculra");
     frame.setSize(400, 400);
     Container cont = frame.getContentPane();
     cont.setLayout((new FlowLayout()));
     frame.setLocationRelativeTo(null);     
     jb1 = new JButton();
     jb2 = new JButton();
     jb3 = new JButton();
     jb4 = new JButton();
     jtx1 = new JTextField();
     jtx2 = new JTextField();
     jtx3 = new JTextField();
     jtx1.setText("Digite o primeiro valor");
     jtx2.setText("Digite o segundo valor:");
     jtx3.setText("Resutlado");
     jb1.setText("+");
     jb2.setText("-");
     jb3.setText("*");
     jb4.setText("/");
     jtx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtx1.setText("");
            }
        });
     jtx2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jtx2.setText("");
            }
     }); 
     jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int primeiroValor = Integer.parseInt(jtx1.getText());
                int segundoValor = Integer.parseInt(jtx2.getText());
                int resultado = primeiroValor + segundoValor;
                jtx3.setText(String.valueOf(resultado));
            }
        });
     
     cont.add(jtx1);
     cont.add(jtx2);
     cont.add(jtx3);     
     cont.add(jb1);
     cont.add(jb2);
     cont.add(jb3);
     cont.add(jb4);   
     frame.addWindowListener(new WindowAdapter() {
           public void windowClosing(java.awt.event.WindowEvent evt){
               System.exit(0);
           }
     
     });
     
     frame.setVisible(true);
     
 }
}

