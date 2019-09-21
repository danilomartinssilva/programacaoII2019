/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.implementandoeventos;

import componentes.EventoActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class Setup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventoActionListener janela_evento = 
                new EventoActionListener(300, 300, "Minha janela");
        JButton b1,b2;
        JTextField jt;
        b1 = new JButton("Botão 1");
        b1.addActionListener(janela_evento);
        b2 = new JButton("Botão 2");
        b2.addActionListener(janela_evento);     
        jt = new JTextField("Escreva alguma coisa");
        jt.addActionListener(janela_evento);
        
        
        
        janela_evento.add(jt);
        janela_evento.add(b2);
        janela_evento.add(b1);
        janela_evento.setVisible(true);
        
    }
    
}
