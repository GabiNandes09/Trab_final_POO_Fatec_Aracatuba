package ModelDAO;

import Database.Conexao;
import Models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
