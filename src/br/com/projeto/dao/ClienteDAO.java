/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.model.Clientes;

/**
 *
 * @author Pâmela
 */
public class ClienteDAO {
    
    public void cadastrarCliente(Clientes obj){
        
        // 1ºPasso:Criar o comando sql
        try {
            String sql = "insert into tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"+" values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        } catch (Exception e) {
        }
        
    }
    
     public void alterarCliente(){
        
    }
      public void excluirCliente(){
        
    }
}
