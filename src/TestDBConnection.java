import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/coursejdbc?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "developer";
        String password = "1234567";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
