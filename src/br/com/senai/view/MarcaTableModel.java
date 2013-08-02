/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.view;

import br.com.senai.modelo.negosio.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clayson_medeiros
 */
public class MarcaTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private List<Marca> linhas;
    private String[] colunas = {"Id", "Nome"};

    public MarcaTableModel(){
        linhas = new ArrayList<Marca>();
    }
    
    public MarcaTableModel(List<Marca> marcas){
         linhas = new ArrayList<Marca>();
    }
    
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    public Class getColumnClass(int columnindex){
        if(columnindex == COL_ID){
            return Integer.class;                        
        }else if(columnindex == COL_NOME){
            return String.class;
        }        
        return null;
    }    
    
    //Indica se a célula é editavel
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public Marca getMarca(int indiceLinha){
        return linhas.get(indiceLinha);
    }
    
    public void addMarca(Marca marca){
        //adiciona o registro
        linhas.add(marca);
        
        //Pega a quantidade de registros (os registros começam com zero
        int ultimoIndice = getRowCount() -1;
        
        //Notifica a mudança
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }   
    
    /**
     * Atualiza uma linha
     */
    public void updateMarca(int indiceLinha, Marca marca){
        linhas.set(indiceLinha, marca);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        
    }
    
    public void removeMarca(int indiceLinha){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);               
    }
    
    /**
     * remove todos os registros
     */
    public void limpar(){
        linhas.clear();
    }
    
    public int getRowCount() {
        return linhas.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }


    public Object getValueAt(int rowIndex, int columnIndex) {
        Marca m = linhas.get(rowIndex);

        if (columnIndex == COL_ID) {
            return m.getId();
        } else if (COL_NOME == COL_NOME) {
            return m.getNome();
        }
        return " ";
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        Marca m = linhas.get(rowIndex);
        
        if (columnIndex == COL_ID ){
            m.setId((Integer)aValue);           
        }else if( columnIndex == COL_NOME ){
            m.setNome(aValue.toString());
        }
            
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
