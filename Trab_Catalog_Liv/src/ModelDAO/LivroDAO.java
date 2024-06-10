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
        String sql = "INSERT INTO livros (livro_nome, autor_id, genero_id, editora_id) VALUES (?,?,?,?)";
        conn = new Conexao().getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, livro.getLivro_nome());
            pstm.setInt(2, livro.getAutor_id());
            pstm.setInt(3, livro.getGenero_id());
            pstm.setInt(4, livro.getEditora_id());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<Livro> listarLivros() {
        String query = "SELECT livro_id, livro_nome, autor_id, genero_id, editora_id FROM livros";
        ArrayList<Livro> listaLivros = new ArrayList<>();

        try (Connection connection = new Conexao().getConexao(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Livro livro = new Livro();
                livro.setLivro_id(resultSet.getInt("livro_id"));
                livro.setLivro_nome(resultSet.getString("livro_nome"));
                livro.setAutor_id(resultSet.getInt("autor_id"));
                livro.setGenero_id(resultSet.getInt("genero_id"));
                livro.setEditora_id(resultSet.getInt("editora_id"));
                listaLivros.add(livro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaLivros;
    }

    public String[] pegarInfoLivros(Livro x) {
        String[] resposta = new String[3];

        // Consulta para recuperar o nome do autor
        String sqlAutor = "SELECT autor_nome FROM autor WHERE autor_id = ?";
        // Consulta para recuperar o nome da editora
        String sqlEditora = "SELECT editora_nome FROM editora WHERE editora_id = ?";
        // Consulta para recuperar o nome do gênero
        String sqlGenero = "SELECT genero_nome FROM genero WHERE genero_id = ?";

        try (Connection connection = new Conexao().getConexao()) {
            // Consulta para o autor
            try (PreparedStatement statement = connection.prepareStatement(sqlAutor)) {
                statement.setInt(1, x.getAutor_id());
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        resposta[0] = resultSet.getString("autor_nome");
                    }
                }
            }

            // Consulta para a editora
            try (PreparedStatement statement = connection.prepareStatement(sqlEditora)) {
                statement.setInt(1, x.getEditora_id());
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        resposta[1] = resultSet.getString("editora_nome");
                    }
                }
            }

            // Consulta para o gênero
            try (PreparedStatement statement = connection.prepareStatement(sqlGenero)) {
                statement.setInt(1, x.getGenero_id());
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        resposta[2] = resultSet.getString("genero_nome");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resposta;
    }

}
