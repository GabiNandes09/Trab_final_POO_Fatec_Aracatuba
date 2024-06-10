package ModelDAO;

import Database.Buscar;
import Database.Conexao;
import Models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EditoraDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void cadastrarEditora(Editora editora) throws ClassNotFoundException {
        String sql = "INSERT INTO editora (editora_nome) VALUES (?)";
        conn = new Conexao().getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, editora.getEditora_nome());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ArrayList<Editora> listarEditora (){
        String query = "SELECT editora_id, editora_nome FROM editora ORDER BY editora_nome ASC";
        ArrayList<Editora> listaEditora = new ArrayList<>();

        try (Connection connection = new Conexao().getConexao();
                Statement statement = connection.createStatement(); 
                ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Editora editora = new Editora();
                editora.setEditora_id(resultSet.getInt("editora_id"));
                editora.setEditora_nome(resultSet.getString("editora_nome"));
                listaEditora.add(editora);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaEditora;
    }
    public Editora editarEditora(JComboBox<String> tabela) {
        Editora editora = new Editora();
        int x = Buscar.buscarEditora(listarEditora(), tabela);
        String sql = "SELECT editora_id, editora_nome FROM editora WHERE editora_id=" + x;
        try (Connection connection = new Conexao().getConexao();
             Statement statement = connection.createStatement(); 
             ResultSet resultSet = statement.executeQuery(sql)) {
            
            while (resultSet.next()) {
                editora = new Editora(resultSet.getInt("editora_id"), resultSet.getString("editora_nome"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return editora;
    }
    public void atualizarEditora (Editora editora){
        String novoNome = editora.getEditora_nome();
        int id = editora.getEditora_id();
        String sql = "UPDATE editora SET editora_nome = ? WHERE editora_id = ?";
        
        try (Connection connection = new Conexao().getConexao();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, novoNome);
            statement.setInt(2, id);
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteEditora(JComboBox<String> tabela){
         int id = Buscar.buscarEditora(listarEditora(), tabela);
        String sql = "DELETE FROM editora WHERE editora_id = " + id;
        try (Connection connection = new Conexao().getConexao();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static int contarEditora(Editora editora){
        String sql = "SELECT COUNT(*) AS total_livros " + 
                "FROM livros " + "WHERE editora_id = " + editora.getEditora_id();
        int qtd = 0;
         try (Connection connection = new Conexao().getConexao();
             Statement statement = connection.createStatement(); 
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                qtd = resultSet.getInt("total_livros");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return qtd;
    }
}
