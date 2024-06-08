package ModelDAO;

import Database.Conexao;
import Models.Livro;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class LivroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Livro> lista = new ArrayList<>();

    public void cadastrarLivro(Livro livro) throws ClassNotFoundException {
        String sql = "INSERT INTO livros (livro_nome) VALUES (?)";
        conn = new Conexao().getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, livro.getLivro_nome());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<Livro> listarLivros() {
        String query = "SELECT id_livro, titulo_livro, id_autor, id_genero, id_editora FROM livros";
        ArrayList<Livro> listaLivros = new ArrayList<>();

        try (Connection connection = new Conexao().getConexao();
                Statement statement = connection.createStatement(); 
                ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Livro livro = new Livro();
                livro.setLivro_id(resultSet.getInt("id_livro"));
                livro.setLivro_nome(resultSet.getString("titulo_livro"));
                livro.setAutor_id(resultSet.getInt("id_autor"));
                livro.setGenero_id(resultSet.getInt("id_genero"));
                livro.setEditora_id(resultSet.getInt("id_editora"));
                listaLivros.add(livro);                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaLivros;
    }
}
