package Application;

import java.sql.Connection;
import db.DB;

public class application {

    public static void main(String[] args) {
        System.out.println("Testando conexão...");
        
        Connection conn = DB.getConnection();
        
        if (conn != null) {
            System.out.println("Sucesso! O MySQL Connector está funcionando 100%.");
        }
    }
}