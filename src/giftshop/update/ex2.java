package giftshop.update;

import java.sql.*;

public class ex2 {
    public static void main(String[] args) {
//        ex2_1();
//        ex2_2();
//        ex2_3();
        ex2_4();
    }
    private static void ex2_1(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update categories set CategoryName='SeaFood VN' where CategoryName='Seafood'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from categories where CategoryName='SeaFood VN'";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("CategoryID"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_2(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update Customers set Address='1A Yet Kieu-Ha Noi' where CustomerID='FRANK'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from Customers where CustomerID='FRANK'";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getString("Address"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_3(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update products set UnitPrice=UnitPrice*1.1 where CategoryID=5";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from products where CategoryID=5";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("UnitPrice"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_4(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update orders set ShipVia=3 where OrderID=10313";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from orders where OrderID=10313";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("ShipVia"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
