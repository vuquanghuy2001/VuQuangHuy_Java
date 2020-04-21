package StartMySQL;

import java.sql.*;
import java.util.Scanner;

public class Excercises_2 {
    public static void main(String[] args) throws SQLException {
//        Excercises2_1();
//        Excercises2_2();
//        Excercises2_3();
//        Excercises2_4();
//        Excercises2_5();
    }

    private static void Excercises2_1(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from customers";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount=0;
            while (rset.next()){
                String Address =rset.getString("Address");
                String City =rset.getString("City");
                String CompanyName =rset.getString("CompanyName");
                String ContactName =rset.getString("ContactName");
                String Contacttitle =rset.getString("Contacttitle");
                String Country =rset.getString("Country");
                String Fax =rset.getString("Fax");
                String Phone =rset.getString("Phone");
                String PostalCode =rset.getString("PostalCode");
                String Region =rset.getString("Region");
                System.out.println(Address+","+City+","+CompanyName+","+ContactName+","+Contacttitle
                                    +","+Country+","+Fax+","+Phone+","+PostalCode+","+Region);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void Excercises2_2(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter name customers: ");
            String name=input.nextLine();
            String strSelect ="select * from customers where "+"ContactName='"+name+"'";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount=0;
            while (rset.next()){
                String Address =rset.getString("Address");
                String City =rset.getString("City");
                String CompanyName =rset.getString("CompanyName");
                String ContactName =rset.getString("ContactName");
                String Contacttitle =rset.getString("Contacttitle");
                String Country =rset.getString("Country");
                String Fax =rset.getString("Fax");
                String Phone =rset.getString("Phone");
                String PostalCode =rset.getString("PostalCode");
                String Region =rset.getString("Region");
                System.out.println(Address+","+City+","+CompanyName+","+ContactName+","+Contacttitle
                        +","+Country+","+Fax+","+Phone+","+PostalCode+","+Region);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }

    }

    private static void Excercises2_3(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from products";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount=0;
            while (rset.next()){
                String CategoryID =rset.getString("CategoryID");
                String Discontinued =rset.getString("Discontinued");
                String ProductID =rset.getString("ProductID");
                String QuantityPerUnit =rset.getString("QuantityPerUnit");
                String ReorderLevel =rset.getString("ReorderLevel");
                String SupplierID =rset.getString("SupplierID");
                String UnitPrice =rset.getString("UnitPrice");
                String UnitsInStock =rset.getString("UnitsInStock");
                String UnitsOnOrder =rset.getString("UnitsOnOrder");
                System.out.println(CategoryID+","+Discontinued+","+ProductID+","+QuantityPerUnit+","+ReorderLevel
                        +","+SupplierID+","+UnitPrice+","+UnitsInStock+","+UnitsOnOrder);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void Excercises2_4(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the price of the item you want to buy: ");
            int price1=input.nextInt();
            int price2=input.nextInt();
            String strSelect ="select * from products where"+"UnitPrice"+price1+"AND"+price2;
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount=0;
            while (rset.next()){
                String CategoryID =rset.getString("CategoryID");
                String Discontinued =rset.getString("Discontinued");
                String ProductID =rset.getString("ProductID");
                String QuantityPerUnit =rset.getString("QuantityPerUnit");
                String ReorderLevel =rset.getString("ReorderLevel");
                String SupplierID =rset.getString("SupplierID");
                String UnitPrice =rset.getString("UnitPrice");
                String UnitsInStock =rset.getString("UnitsInStock");
                String UnitsOnOrder =rset.getString("UnitsOnOrder");
                System.out.println(CategoryID+","+Discontinued+","+ProductID+","+QuantityPerUnit+","+ReorderLevel
                        +","+SupplierID+","+UnitPrice+","+UnitsInStock+","+UnitsOnOrder);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void Excercises2_5(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect ="select * from orders";
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount=0;
            while (rset.next()){
                String CustomerID =rset.getString("CustomerID");
                String EmployeeID =rset.getString("EmployeeID");
                String Freight =rset.getString("Freight");
                String OrderDate =rset.getString("OrderDate");
                String OrderID =rset.getString("OrderID");
                String RequiredDate =rset.getString("RequiredDate");
                String ShipAddress =rset.getString("ShipAddress");
                String ShipCity =rset.getString("ShipCity");
                String ShipCountry =rset.getString("ShipCountry");
                String ShipName =rset.getString("ShipName");
                String Shippeddate =rset.getString("Shippeddate");
                String ShipPostalCode =rset.getString("ShipPostalCode");
                String ShipRegion =rset.getString("ShipRegion");
                String ShipVia =rset.getString("ShipVia");
                System.out.println(CustomerID+","+EmployeeID+","+Freight+","+OrderDate+","+OrderID
                        +","+RequiredDate+","+ShipAddress+","+ShipCity+","+ShipCountry+","+ShipName+","+Shippeddate+","+ShipPostalCode+","+ShipRegion+","+ShipVia);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
