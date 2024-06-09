package Database;

import Models.*;
import java.util.*;
import javax.swing.*;

public class Buscar {
    public static int buscarAutor(ArrayList<Autor> lista, JComboBox<String> tabela){
        int id = -1;
        int z = tabela.getSelectedIndex();        
        Autor x = lista.get(z);
        
        return x.getAutor_id();        
    }
    public static int buscarEditora(ArrayList<Editora> lista, JComboBox<String> tabela){
        int id = -1;
        int z = tabela.getSelectedIndex();        
        Editora x = lista.get(z);
        
        return x.getEditora_id();
    }
    public static int buscarGenero(ArrayList<Genero> lista, JComboBox<String> tabela){
        int id = -1;
        int z = tabela.getSelectedIndex();        
        Genero x = lista.get(z);
        
        return x.getGenero_id();
    }
}
