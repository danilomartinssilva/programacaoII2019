/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pii.tratamentodeerros;

/**
 *
 * @author Danilo
 */
public class MinhaException extends Throwable{
    public MinhaException(){
        super("Houve um erro na aplicação!");
    }
    
}
