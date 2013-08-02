/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.view;

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

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Marca m = linhas.getClass(row);

        if (columnIndex == COL_ID) {
            return m.getId();
        } else (COL_NOME == COL_NOME){
        
        
        {
            return m.getNome();
        }
    }


