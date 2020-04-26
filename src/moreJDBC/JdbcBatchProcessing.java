package moreJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcBatchProcessing {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");

        PreparedStatement pstmt = conn.prepareStatement(
                "insert into books values (?, ?, ?, ?, ?)");

        conn.setAutoCommit(false);

        pstmt.setInt(1, 8003);
        pstmt.setString(2, "Java 123");
        pstmt.setString(3, "Kevin Jones");
        pstmt.setDouble(4, 12.34);
        pstmt.setInt(5, 88);
        pstmt.addBatch();

        pstmt.setInt(1, 8004);
        pstmt.setString(2, "Java 456");
        pstmt.addBatch();

        int[] returnCodes = pstmt.executeBatch();

        System.out.print("Return codes are: ");
        for (int code : returnCodes) System.out.printf(code + ", ");
        System.out.println();

        conn.commit();
    }
}
