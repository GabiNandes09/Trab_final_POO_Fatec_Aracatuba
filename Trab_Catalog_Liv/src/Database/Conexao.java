package Database;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static String status = "Não conectou...";

    public static java.sql.Connection getConexao() {
        Connection conn = null;
        

        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);

            String url = "jdbc:mysql://localhost:3306/biblioteca";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);

            if (conn != null) {
                status = ("STATUS --> Conectado com sucesso!");
            } else {
                status = ("STATUS --> Não foi possivel realizar conexão");
            }
            return conn;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "O driver especificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }

    public static String statusConection() {
        return status;
    }

    public static boolean FecharConexao() {
        try {
            Conexao.getConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return Conexao.getConexao();
    }
}
