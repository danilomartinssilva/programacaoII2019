/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.jdbc;

import Beans.Carro;
import DAOs.CarroDAO;
import DAOs.Conexao;

/**
 *
 * @author Danilo
 */
public class Setup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Carro c = new Carro("GOL QUADRADO", "Branco", 1992,14,5600.99);
           CarroDAO cDao = new CarroDAO();
           cDao.addCarro(c);
           int tam = cDao.mostraCarros().size();
           for(int i=0;i<tam;i++){
               System.out.println("Nome: "+cDao.mostraCarros().get(i).getNome());
               System.out.println("Ano: "+cDao.mostraCarros().get(i).getAno());
               System.out.println("Cor: "+cDao.mostraCarros().get(i).getCor());
               System.out.println("Potencia: "+cDao.mostraCarros().get(i).getPotencia());
               System.out.println("Valor: "+cDao.mostraCarros().get(i).getValor());
               System.out.println("-----------------------------------------------------------------");
           }
           
    }
    
}
