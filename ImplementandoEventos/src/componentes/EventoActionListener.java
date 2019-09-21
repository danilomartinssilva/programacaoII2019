/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class EventoActionListener extends JFrame implements ActionListener{
    
    public EventoActionListener(int x, int y, String titulo){
        super();
        this.setTitle(titulo);
        this.setSize(x,y);
        this.getContentPane().setLayout(new FlowLayout());
        
    
    }
    
   
    public void actionPerformed(ActionEvent e){
         
        Object o = e.getSource();
        if(o instanceof JButton){
            String comando = e.getActionCommand();
        System.out.println("Vendo o comando"+ comando);
        System.out.println(e.getSource().toString());
        System.out.println("E um texto"+((JTextField) o).getText());
        
        }
        
        
       if(o instanceof JTextField){
           
           System.out.println("E um texto"+((JTextField) o).getText());
       }
        
        
    }
    
    
    
}
