package giftshop.update;

import java.sql.*;

public class update{
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update books set price = price*0.7, qty = qty+1 where id = 1001";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from books where id = 1001";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("author") + ", "
                        + rset.getString("title") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
