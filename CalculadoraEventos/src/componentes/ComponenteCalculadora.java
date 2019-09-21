/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class ComponenteCalculadora extends JFrame implements ActionListener{
    private static final JTextField valor1 = new JTextField() ;
    private static final JTextField valor2 = new JTextField();
    private static final JButton btnSoma = new JButton("+");
    private static final JButton btnSubtracao = new JButton("-");
    private static final JButton btnMultiplicacao = new JButton("*");
    private static final JButton btnDivisao = new JButton("/");
    private static final  JButton btnPotencia = new JButton("^");
    private static final JButton btnRaiz = new JButton("SQRT");
    private static final JButton btnSaida = new JButton("Sair");
    
    public static void main (String args[]){
        
        ComponenteCalculadora frame = new ComponenteCalculadora();
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        frame.setSize(700,100);
        frame.setLocation(1024/3,768/2); 
        valor1.setColumns(10);
        valor2.setColumns(10);
        cont.add(btnSoma);
        cont.add(btnMultiplicacao);
        cont.add(btnPotencia);
        cont.add(btnDivisao);
        cont.add(btnRaiz);
        cont.add(btnSubtracao);
        cont.add(valor1);
        cont.add(valor2);
        cont.add(btnSaida);
        btnSoma.addActionListener(frame);
        btnSubtracao.addActionListener(frame);
        btnMultiplicacao.addActionListener(frame);
        btnRaiz.addActionListener(frame);
        btnDivisao.addActionListener(frame);
        btnPotencia.addActionListener(frame);
        btnSaida.addActionListener(frame);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){        
        if(e.getSource()==btnSaida){
            System.exit(0);
        }
        if(e.getSource()==btnSoma){
        double resultado = 
                   this.soma(Double.parseDouble(valor1.getText()),
                   Double.parseDouble(valor2.getText()));
        this.mostraResultado(resultado);
        }
        if(e.getSource()==btnSubtracao){
        double resultado = 
                   this.subtracao(Double.parseDouble(valor1.getText()),
                   Double.parseDouble(valor2.getText()));
        this.mostraResultado(resultado);
        }
        if(e.getSource()==btnDivisao){
        double resultado = 
                   this.divisao(Double.parseDouble(valor1.getText()),
                   Double.parseDouble(valor2.getText()));
        this.mostraResultado(resultado);
        }
        if(e.getSource()==btnMultiplicacao){
        double resultado = 
                   this.multiplicacao(Double.parseDouble(valor1.getText()),
                   Double.parseDouble(valor2.getText()));
        this.mostraResultado(resultado);
        }
        if(e.getSource()==btnPotencia){
        double resultado = 
                   this.potencia(Double.parseDouble(valor1.getText()),
                   Double.parseDouble(valor2.getText()));
        this.mostraResultado(resultado);
        }
        if(e.getSource()==btnRaiz){
        double resultado = 
                   this.raiz(Double.parseDouble(valor1.getText()));
        this.mostraResultado(resultado);
        }
    }
    public double soma (double x, double y){
        return x+y;
    }
    public double subtracao(double x, double y){
        return x-y;
    }
    public double multiplicacao(double x, double y){
        return x*y;
    }
    public double divisao (double x, double y){
        return x/y;
    }
    public double potencia (double x,double y){
      return Math.pow(x, y);
    }
    public double raiz (double x){
        return Math.sqrt(x);
    }
    public void mostraResultado(double x){
        JOptionPane.showMessageDialog(null, "O resultado é:"+ x);
    }
    
    
    
    
    
}
