/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Pâmela
 */
public class ConnectionFactory {

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("");
           

        } catch (Exception erro) {
            
            throw new RuntimeException(erro);
        }
        
       
    }

}
