package Repository;


import Entity.Bank;
import configuration.DbConnection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
@NoArgsConstructor
public class BankRepository {


    private static final String INSERT_QUERY = "INSERT INTO tbl_user (first_name,last_name,age,national_code,birth_date_certificate,birth_date) VALUES (?,?,?,?,?,?)";
    private static final String UPDATE_QUERY = "update tbl_user set first_name = ?,last_name = ? , age=? ,national_code=? ,birth_date_certificate=? ,birth_date=? WHERE id =?;";
    private static final String SELECT_BY_ID_QUERY = "select * from tbl_user where id = ?;";

    public static boolean createUser(Bank bank) {
        try {
            Connection connection = DbConnection.getInstance();
            PreparedStatement prepareStatement = connection.prepareStatement(INSERT_QUERY);
            prepareStatement.setString(1, bank.getBankId());


            int result = prepareStatement.executeUpdate();

            prepareStatement.close();
            connection.close();

            return result > 0;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }

    }

    public static int updateUser(Bank user) {
        try {
            Connection connection = DbConnection.getInstance();
            PreparedStatement prepareStatement = connection.prepareStatement(UPDATE_QUERY);
            prepareStatement.setString(1, user.getFirstName());
            prepareStatement.setString(2, user.getLastName());
            prepareStatement.setInt(3, user.getAge());
            prepareStatement.setString(4, user.getNationalCode());
            prepareStatement.setString(5, user.getBirthDateCertificate());
            prepareStatement.setString(6, user.getBirthDate());
            prepareStatement.setInt(7, user.getId());

            int result = prepareStatement.executeUpdate();

            prepareStatement.close();
            connection.close();

            return result;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }

    }

    public static Bank selectUserById(int id) {
        try {
            Connection connection = DbConnection.getInstance();
            PreparedStatement prepareStatement = connection.prepareStatement(SELECT_BY_ID_QUERY);
            prepareStatement.setInt(1, id);

            ResultSet rs = prepareStatement.executeQuery();

            Bank bank = new Bank();

            while(rs.next()) {
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setAge(rs.getInt("age"));
                user.setNationalCode(rs.getString("national_code"));
                user.setBirthDateCertificate(rs.getString("birth_date_certificate"));
                user.setBirthDate(rs.getString("birth_date"));
            }


            prepareStatement.close();
            connection.close();

            return user;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

}
