package MainJavaSwing.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDatabase {
    // kết nối với mySql ở đây
    private static String DB_URL = "jdbc:mysql://localhost:3306/dictionaryDB";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static void main(String args[]) {
//        try {
//            // connnect to database 'testdb'
//            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
//            // crate statement
//            Statement stmt = conn.createStatement();
//            // get data from table 'student'
//            ResultSet rs = stmt.executeQuery("select * from student");
//            // show data
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

    public static Connection getConnection() throws Exception {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
