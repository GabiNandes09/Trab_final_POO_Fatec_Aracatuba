package Models;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import Models.*;

public class LivroTableModel extends AbstractTableModel{

    private final String[] colunas = {"ID", "Nome", "Autor", "Editora", "Genero"};
    private List<Livro> livros;

    public LivroTableModel(List<Livro> livros) {
        this.livros = livros;
    }
     
       
    
    @Override
    public int getRowCount() {
        return livros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Livro livro = livros.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return livro.getLivro_id();
            case 1:
                return livro.getLivro_nome();
            case 2:
                return livro.getAutor_id();
            case 3:
                return livro.getEditora_id();
            case 4:
                return livro.getGenero_id();
            default:
                return null;
        }
    }    
}
