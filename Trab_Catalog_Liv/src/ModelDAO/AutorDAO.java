package ModelDAO;

import Database.Conexao;
import Models.Autor;
import Models.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ArrayList<Autor> listarAutor (){
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
    
}
