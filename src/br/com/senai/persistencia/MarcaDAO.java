/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.persistencia;

import br.com.senai.modelo.negosio.Marca;
import java.util.List;

/**
 *
 * @author clayson_medeiros
 */
public interface MarcaDAO {
    
    void inserir(Marca m);
    void atualizar(Marca m);
    void excluir(int id);
    List<Marca> getMarca();
    List<Marca> getMarcaByNome(String nome);
    Marca getMarcaById(int id);
    
}
