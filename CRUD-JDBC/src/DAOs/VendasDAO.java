package DAOs;

import Beans.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class VendasDAO {
    private Connection conn  = null;
    static private String INSERT="INSERT INTO vendas"
            + " (id_carros,id_pessoas) VALUES (?,?)";
    static private String READ = "SELECT * FROM vendas";
    static private String DELETE = "DELETE FROM vendas WHERE id = ?";
    static private String UPDATE = "UPDATE vendas SET id_carros = ? ,"
            + "id_pessoas=? WHERE id=?";
public VendasDAO(){
  this.conn = Conexao.getConnection();
}

public void addVendas(Vendas v){
    try{
        PreparedStatement stmt = this.conn.prepareStatement(INSERT);
        stmt.setInt(1, v.getId_carro_fk());
        stmt.setInt(2, v.getId_pessoa_fk());
        stmt.execute();
            
        
        stmt.execute();
        
    }catch(SQLException e){
        System.out.println("Erro ao inserir");
    }
    
    public ArrayList<Vendas> mostrarVendas(){
        ArrayList<Vendas> lista_vendas = new ArrayList<>();
        try{
            PreparedStatement stmt =this.conn.prepareStatement(READ);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
            
                Vendas v = new Vendas(rs.getInt("id_pessoa_fk"), rs.getInt("id_carro_fk"));
                lista_vendas.add(v);
            }
            rs.close();
        }
        catch(SQLException e){
            System.out.println("Erro ao listar vendas"+e.getMessage());
        }
        
    }
}


}

