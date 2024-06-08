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

public class GeneroDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void cadastrarGenero(Genero genero) throws ClassNotFoundException {
        String sql = "INSERT INTO genero (genero_nome) VALUES (?)";
        conn = new Conexao().getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, genero.getGenero_nome());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ArrayList<Genero> listarGenero (){
        String query = "SELECT genero_id, genero_nome FROM genero ORDER BY genero_nome ASC";
        ArrayList<Genero> listaGenero = new ArrayList<>();

        try (Connection connection = new Conexao().getConexao();
                Statement statement = connection.createStatement(); 
                ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Genero genero = new Genero();
                genero.setGenero_id(resultSet.getInt("genero_id"));
                genero.setGenero_nome(resultSet.getString("genero_nome"));
                listaGenero.add(genero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaGenero;
    }
}
