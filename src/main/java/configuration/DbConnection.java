package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection connection = null;
    private DbConnection(){}

    public static Connection getInstance() throws SQLException{
        if (connection == null || connection.isClosed()){
            connection = DriverManager.getConnection(DbConfiguration.DB_URL,
                    DbConfiguration.DB_USERNAME,DbConfiguration.DB_PASSWORD);
        }
        return connection;
    }
}
