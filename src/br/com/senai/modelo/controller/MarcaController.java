/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.modelo.controller;

import br.com.senai.modelo.negosio.Marca;
import br.com.senai.persistencia.MarcaDAO;
import br.com.senai.persistencia.MarcaDAOJDBC;
import java.util.List;

/**
 *
 * @author clayson_medeiros
 */
public class MarcaController {
    
    public void inserir (Marca m){
        MarcaDAO md = new MarcaDAOJDBC() {};
        md.inserir(m);
    }
    
    public void atualizar (Marca m){
        MarcaDAO md = new MarcaDAOJDBC() {};
        md.atualizar(m);
    }
    
    public void excluir (int id){
        MarcaDAO md = new MarcaDAOJDBC() {};
        md.excluir(id);
    }
    
    public List<Marca> getMarcaByNome (String nome){
        MarcaDAO md = new MarcaDAOJDBC() {};
        return md.getMarcaByNome(nome);
    }
     
    public List<Marca> getMarca (){
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarca();
    }
    
    public Marca getMarcaById (int id){
        MarcaDAO md = new MarcaDAOJDBC() {};
        return md.getMarcaById(id);
    }
    
    
}
