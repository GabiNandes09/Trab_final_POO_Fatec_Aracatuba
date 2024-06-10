package ModelDAO;

import Database.*;
import Models.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class AutorDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void cadastrarAutor(Autor autor) throws ClassNotFoundException {
        String sql = "INSERT INTO autor (autor_nome) VALUES (?)";
        conn = new Conexao().getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, autor.getAutor_nome());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ArrayList<Autor> listarAutor() {
        String query = "SELECT autor_id, autor_nome FROM autor ORDER BY autor_nome ASC";
        ArrayList<Autor> listaAutor = new ArrayList<>();

        try (Connection connection = new Conexao().getConexao();
             Statement statement = connection.createStatement(); 
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Autor autor = new Autor();
                autor.setAutor_id(resultSet.getInt("autor_id"));
                autor.setAutor_nome(resultSet.getString("autor_nome"));
                listaAutor.add(autor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAutor;
    }
    public Autor editarAutor(JComboBox<String> tabela) {
        Autor autor = new Autor();
        int x = Buscar.buscarAutor(listarAutor(), tabela); 
        String sql = "SELECT autor_id, autor_nome FROM autor WHERE autor_id=" + x;
        try (Connection connection = new Conexao().getConexao();
             Statement statement = connection.createStatement(); 
             ResultSet resultSet = statement.executeQuery(sql)) {
            
            while (resultSet.next()) {
                autor = new Autor(resultSet.getInt("autor_id"), resultSet.getString("autor_nome"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return autor;
    }
    public void atualizarAutor(Autor autor) {
        String novoNome = autor.getAutor_nome();
        int id = autor.getAutor_id();
        String sql = "UPDATE autor SET autor_nome = ? WHERE autor_id = ?";
        
        try (Connection connection = new Conexao().getConexao();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, novoNome);
            statement.setInt(2, id);
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteAutor(JComboBox<String> lista){
        int id = Buscar.buscarAutor(listarAutor(), lista);
        String sql = "DELETE FROM autor WHERE autor_id = " + id;
        try (Connection connection = new Conexao().getConexao();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
 
}
