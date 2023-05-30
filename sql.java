package Server;
import java.sql.*;

public class sql{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gouthu";
        String username = "root";
        String password = "Gouthu@18";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);


            Statement statement = connection.createStatement();
            String sql="update gouthami set name='lohi' where roll=1003";
            statement.executeUpdate(sql);
            String s1="delete from  gouthami where roll=1004";
            statement.executeUpdate(s1);
            String s="create table if not exists student(id int primary key,name varchar(20)";
            statement.executeUpdate(s);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                // Process the data here
                String data = resultSet.getString("name");
                String gpa = resultSet.getString( columnLabel: "gpa");
                Steing id = resultSet.getString( columnLabel: "id");
                System.out.println(id + " " + gpa);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}