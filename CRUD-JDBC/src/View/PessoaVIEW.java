/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Beans.Pessoa;
import DAOs.CarroDAO;
import DAOs.PessoaDAO;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danilo
 */
public class PessoaVIEW extends JFrame implements ActionListener{
    private JTextField txNome,txCpf,txRg,txIdade;
    private JLabel lbNome,lbCpf,lbRg,lbIdade;
    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnLimpar = new JButton("Limpar");
    private PessoaDAO pDAO = new PessoaDAO();
    DefaultTableModel modelo;
    JTable jtable;
    ResultSet rs;
    private Pessoa retorno;
    
    public PessoaVIEW(){
        super("Gerenciamento de Pessoas");
        this.txNome =new JTextField(60);
        this.txIdade = new JTextField(30);
        this.txCpf = new JTextField(60);
        this.txRg = new JTextField(60);
        this.lbIdade = new JLabel("Idade");
        lbIdade.setLabelFor(txIdade);
        this.lbRg = new JLabel("RG");
        this.lbRg.setLabelFor(this.txRg);        
        this.lbCpf = new JLabel("Cpf");
        this.lbCpf.setLabelFor(this.txCpf);
        this.lbNome = new JLabel("Nome");
        this.lbNome.setLabelFor(this.txNome);
        
        //JTABLE
         modelo = new DefaultTableModel();
         jtable = new JTable(modelo);
         
        // jtable.addMouseListener(this);
         modelo.addColumn("id");
         modelo.addColumn("nome");
         modelo.addColumn("cpf");
         jtable.getColumnModel().getColumn(0).setPreferredWidth(30);
         rs = new PessoaDAO().populaGrid();
         try{
             while(rs.next()){
                modelo.addRow(
                new Object[]{String.valueOf(rs.getInt("id")),
                rs.getString("nome"),
                rs.getString("cpf")
                });
             }             
         }
         catch(SQLException e){
             System.out.println("Erro ao listar"
                     + " os dados na tabela" +e.getMessage());
         }
         JScrollPane scrool = new JScrollPane(jtable);
         JPanel p1 = new JPanel();
         p1.setLayout(null);
         p1.setPreferredSize(new Dimension(720,100) );
         p1.add(scrool);
         scrool.setBounds(5,0,710,100);        
         


        //FINALJTABLE
        

        Container ct = getContentPane();
        ct.setLayout(new FlowLayout(FlowLayout.CENTER));
        ct.add(this.lbIdade);
        ct.add(this.txIdade);
        ct.add(this.lbNome);
        ct.add(this.txNome);
        ct.add(this.lbRg);
        ct.add(this.txRg);
        ct.add(this.lbCpf);
        ct.add(this.txCpf);
        ct.add(this.btnSalvar);
        ct.add(this.btnLimpar);
        this.btnSalvar.addActionListener(this);
        this.btnLimpar.addActionListener(this);
        ct.add(p1);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnSalvar){
            Pessoa p = new Pessoa();            
            p.setNome(this.txNome.getText());
            p.setIdade(Integer.parseInt(this.txIdade.getText()));
            p.setCpf(this.txCpf.getText());
            p.setRg(this.txRg.getText());
            pDAO.addPessoa(p);
            this.retorno = p;
            this.atualizaModelo();
            
            
        }
        if(e.getSource()==btnLimpar){
            this.txNome.setText("");
            this.txIdade.setText("");
            this.txRg.setText("");
            this.txCpf.setText("");
        }
    }
  
    public static void main (String args[]){
        PessoaVIEW pView = new PessoaVIEW();
        pView.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pView.setSize(730, 220);
        pView.setLocationRelativeTo(null);
        pView.setVisible(true);
        
    }
    
    public void atualizaModelo(){
         
          
         modelo.addRow(new Object[]{String.valueOf(this.retorno.getId()),
               this.retorno.getNome(),
                this.retorno.getCpf()
                });        
        
    }
    
    
}
