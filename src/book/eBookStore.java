package book;

import java.sql.*;
import java.util.Scanner;

public class eBookStore {
    public static void main(String[] args) {
        ex1_1();
//        ex1_2();
//        ex1_3();
//        ex1_4();
//        ex1_5();
//        ex2_1();
//        ex2_2();
//        ex2_3();
//        ex2_4();
//        ex2_5();
//        ex2_6();
//        ex2_7();
//        ex2_8();
//        ex2_9();
    }
    private static void ex1_1(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from book";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            // Step 3 & 4: Execute query and process query result
            ResultSet rset = stmt.executeQuery("select * from book");
// Get the metadata of the ResultSet
            ResultSetMetaData rsetMD = rset.getMetaData();
// Get the number of column from metadata
            int numColumns = rsetMD.getColumnCount();

// Print column names - Column Index begins at 1 (instead of 0)
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

// Print column class names
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

// Print column contents for all the rows
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    // getString() can be used for all column types
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

//            ResultSet rset = stmt.executeQuery(strSelect);
//            System.out.println("10 latest books:");
//            int rowCount=0;
//            while (rset.next()){
//                String BookID =rset.getString("BookID");
//                String BookName =rset.getString("BookName");
//                String AuthorName =rset.getString("AuthorName");
//                String Category =rset.getString("Category");
//                String Status =rset.getString("Status");
//                String Amount =rset.getString("Amount");
//                String Price =rset.getString("Price");
//                System.out.println(BookID+","+BookName+","+AuthorName+","+Category+","+Status+","+Amount+","+Price);
//                ++rowCount;
            } catch (SQLException e) {
            e.printStackTrace();
        }
//        System.out.println("Total number of records = " + rowCount);
//        }catch(SQLException ex) {
//            ex.printStackTrace();
//        }
    }
    private static void ex1_2(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect =("select Book.*, sum(OrderDetail.Amount) as 'so luong da ban' from Book inner join OrderDetail on Book.BookID = OrderDetail.BookID group by BookName limit 100");;
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("100 best-selling books:");
            int rowCount=0;
            while (rset.next()){
                String BookID =rset.getString("BookID");
                String BookName =rset.getString("BookName");
                String AuthorName =rset.getString("AuthorName");
                String Category =rset.getString("Category");
                String Status =rset.getString("Status");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                System.out.println(BookID+","+BookName+","+AuthorName+","+Category+","+Status+","+Amount+","+Price);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex1_3(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the category you want to search: ");
            String search=input.next();
            String strSelect =("select * from book where Category ='"+search+"'");
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the category: "+search);
            int rowCount=0;
            while (rset.next()){
                String BookID =rset.getString("BookID");
                String BookName =rset.getString("BookName");
                String AuthorName =rset.getString("AuthorName");
                String Category =rset.getString("Category");
                String Status =rset.getString("Status");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                System.out.println(BookID+","+BookName+","+AuthorName+","+Category+","+Status+","+Amount+","+Price);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex1_4(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the author you want to search: ");
            String search=input.next();
            String strSelect =("select * from book where AuthorName ='" + search + "'");
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the author: "+search);
            int rowCount=0;
            while (rset.next()){
                String BookID =rset.getString("BookID");
                String BookName =rset.getString("BookName");
                String AuthorName =rset.getString("AuthorName");
                String Category =rset.getString("Category");
                String Status =rset.getString("Status");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                System.out.println(BookID+","+BookName+","+AuthorName+","+Category+","+Status+","+Amount+","+Price);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex1_5(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter ID: ");
            int search=input.nextInt();
            String strSelect =("select * from Book where BookID ='"+search+"'");
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the ID: "+search);
            int rowCount=0;
            while (rset.next()){
                String BookID =rset.getString("BookID");
                String BookName =rset.getString("BookName");
                String AuthorName =rset.getString("AuthorName");
                String Category =rset.getString("Category");
                String Status =rset.getString("Status");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                System.out.println(BookID+","+BookName+","+AuthorName+","+Category+","+Status+","+Amount+","+Price);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_1(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from Order_3 "+"Status "+"LIMIT 0,30";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("30 orders received by MOQ: ");
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_2(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter OrderID: ");
            int search=input.nextInt();
            String strSelect ="select * from Order_3 where "+"OrderId "+search;
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the ID: "+search);
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_3(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter OrderID: ");
            int search=input.nextInt();
            String strSelect ="select * from Order_3 where "+"OrderId "+search;
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the ID: "+search);
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_4(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from Order_3 where "+"Status=2";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the Status: ");
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_5(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from Order_3 where "+"Status=3";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the Status: ");
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_6(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from Order_3 where "+"Status=4";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the Status: ");
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_7(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from Order_3 where "+"Status=4";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the Status: ");
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_8(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from Order_3 where "+"Status=5";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the Status: ");
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void ex2_9(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from Order_3 where "+"Status=0";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the Status: ");
            int rowCount=0;
            while (rset.next()){
                String OrderId =rset.getString("OrderId");
                String DateOfSale =rset.getString("DateOfSale");
                String CustomerID =rset.getString("CustomerID");
                String Amount =rset.getString("Amount");
                String Price =rset.getString("Price");
                String Status =rset.getString("Status");
                System.out.println(OrderId+","+DateOfSale+","+CustomerID+","+Amount+","+Price+","+Status);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
