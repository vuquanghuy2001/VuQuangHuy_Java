package book;

import DeleteAndInsert.books2_run;

import java.sql.*;
import java.util.Collection;
import java.util.Scanner;

public class eBookStore2 {
    public static void main(String[] args) throws SQLException {
//         user();
//        login();
//        ex5_1();
//        ex5_2();
//        ex5_3();
//        ex5_4();
//        ex5_5();
//        ex5_6();
//        ex5_7();
//        ex5_8();
    }
    private static void user(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){

            users book2=new users(0,"","",0);
            Scanner input=new Scanner(System.in);
            System.out.println("Please register your account: ");
            System.out.println("Enter ID: ");
            int id=input.nextInt();
            book2.setId(id);
            System.out.println("Enter user name: ");
            String name=input.next();
            book2.setUsername(name);
            System.out.println("Enter pass word: ");
            String pass=input.next();
            book2.setPassword(pass);
            System.out.println("Enter role: ");
            int role=input.nextInt();
            book2.setRole(role);
            String sqlInsert="insert into users values ("+book2.getId()+",'"+book2.getUsername()+"','"+book2.getPassword()+"',"+book2.getRole()+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void login() {
        Scanner input=new Scanner(System.in);
        System.out.println("Username: ");
        String user=input.nextLine();
        System.out.println("PassWord: ");
        String pass=input.nextLine();
        try{
            if (user.equals("") || pass.equals("")){
                System.out.println("Vui long nhap du thong tin!");
            }else {
                String Url="jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC\",\n" +
                        "               \"root\", \"";
                Connection conn=DriverManager.getConnection(Url);
                String sql="SELECT * FROM users WHERE UserName=? AND PassWord=?";
                PreparedStatement stm=conn.prepareStatement(sql);
                stm.setString(1,user);
                stm.setString(2,pass);
                ResultSet rs=stm.executeQuery();
                if (rs.next()){
                    System.out.println("dang nhap thanh cong!");
                }else {
                    System.out.println("dang nhap that bai!");
                }
            }
        }catch (Exception e){
            System.out.println("ket noi that bai");
        }
    }

    private static void ex5_1() throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
        books2_run book2=new books2_run(0,"","",0,0,"","");
        Scanner input=new Scanner(System.in);
        System.out.println("nhap id cua cuon sach: ");
        int id=input.nextInt();
        book2.setId(id);
        System.out.println("nhap ten cuon sach: ");
        String bookname=input.next();
        book2.setName(bookname);
        System.out.println("nhap ten tac gia: ");
        String tentacgia=input.next();
        book2.setAuthor(tentacgia);
        System.out.println("nhap the loai: ");
        String theloai=input.next();
        book2.setCategory(theloai);
        System.out.println("nhap tinh trang: ");
        String tinhtrang=input.next();
        book2.setStatus(tinhtrang);
            System.out.println("nhap so luong: ");
            int soluong=input.nextInt();
            book2.setQty(soluong);
        System.out.println("nhap so tien: ");
        int sotien=input.nextInt();
        book2.setPrice(sotien);

         String sqlInsert="insert into book values ("+book2.getId()+",'"+book2.getName()+"','"+book2.getAuthor()+"','"+book2.getCategory()+"','"+book2.getStatus()+"',"+book2.getQty()+","+book2.getPrice()+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
          int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            String strSelect = "select * from book";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("BookID") + ", "
                        + rset.getString("BookName") + ", "
                        + rset.getString("AuthorName") + ", "
                        + rset.getString("Category") + ", "
                        + rset.getString("Status") + ", "
                        + rset.getInt("Amount")+","
                        + rset.getDouble("Price") + ", ");
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }

    }

    private static void ex5_2(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            books2_run book2=new books2_run(0,"","",0,0,"","");
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the book id you want to edit: ");
            int id=input.nextInt();
            book2.setId(id);
            System.out.println("Please enter a new price for the book: ");
            int price=input.nextInt();
            book2.setPrice(price);
            System.out.println("Enter the number of books: ");
            int qty=input.nextInt();
            book2.setQty(qty);
            String strUpdate = "update book set Price = "+book2.getPrice()+" ,Amount = "+book2.getQty()+ " where BookID = "+book2.getId();
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from book";
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("BookID") + ", "
                        + rset.getString("BookName") + ", "
                        + rset.getString("AuthorName") + ", "
                        + rset.getString("Category") + ", "
                        + rset.getString("Status") + ", "
                        + rset.getInt("Amount")+","
                        + rset.getDouble("Price") + ", ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void ex5_3(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            books2_run book2=new books2_run(0,"","",0,0,"","");
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the id of the book you want to delete: ");
            int id=input.nextInt();
            book2.setId(id);
            String sqlSelect = "select * from orderdetail where BookID = "+book2.getId();
            int count=0;
            ResultSet rset = stmt.executeQuery(sqlSelect);
            while(rset.next()) {
                rset.getInt("BookID");
                count++;
            }
            if (count<1){
                String sqlDelete="delete from book where BookID = "+book2.getId()+"";
                System.out.println("The SQL statement is: "+sqlDelete);
                int countDelete=stmt.executeUpdate(sqlDelete);
                System.out.println(countDelete+" records deleted.");
            }else {
                System.out.println("Can't delete\nthis id = "+book2.getId()+" have order now !!");
            }
    } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void ex5_4(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from book limit 0,100";
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("BookID") + ", "
                        + rset.getString("BookName") + ", "
                        + rset.getString("AuthorName") + ", "
                        + rset.getString("Category") + ", "
                        + rset.getString("Status") + ", "
                        + rset.getInt("Amount")+","
                        + rset.getDouble("Price") + ", ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void ex5_5(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            customer_run customer2=new customer_run(0,"","",0,"");
            Scanner input=new Scanner(System.in);
            System.out.println("nhap id cua nguoi mua: ");
            int id=input.nextInt();
            customer2.setId(id);
            System.out.println("nhap ten nguoi mua: ");
            String customername=input.next();
            customer2.setName(customername);
            System.out.println("nhap dia chi nguoi mua: ");
            String add=input.next();
            customer2.setAdd(add);
            System.out.println("nhap so dien thoai nguoi mua: ");
            int phone=input.nextInt();
            customer2.setPhone(phone);
            System.out.println("nhap dia chi email: ");
            String email=input.next();
            customer2.setEmail(email);

            String sqlInsert="insert into customer values ("+customer2.getId()+",'"+customer2.getName()+"','"+customer2.getAdd()+"',"+customer2.getPhone()+",'"+customer2.getEmail()+"'"+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            String strSelect = "select * from customer";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("CustomerID") + ", "
                        + rset.getString("CustomerName") + ", "
                        + rset.getString("Address") + ", "
                        + rset.getString("Phone") + ", "
                        + rset.getString("Email") + ", ");
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void ex5_6(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            customer_run customer2=new customer_run(0,"","",0,"");
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the customer id you want to edit: ");
            int id=input.nextInt();
            customer2.setId(id);
            System.out.println("Enter your new email: ");
            String emai=input.next();
            customer2.setEmail(emai);
            System.out.println("Enter your new phone number: ");
            int phone=input.nextInt();
            customer2.setPhone(phone);
            String strUpdate = "update customer set Email = '"+customer2.getEmail()+"'"+" ,Phone = "+customer2.getPhone()+ " where CustomerID = "+customer2.getId();
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from customer";
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("CustomerID") + ", "
                        + rset.getString("CustomerName") + ", "
                        + rset.getString("Address") + ", "
                        + rset.getString("Phone") + ", "
                        + rset.getString("Email") + ", ");
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void ex5_7(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            customer_run customer2=new customer_run(0,"","",0,"");
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the id of the customer you want to delete: ");
            int id=input.nextInt();
            customer2.setId(id);
            String sqlSelect = "select * from order_3 where CustomerID = "+customer2.getId();
            int count=0;
            ResultSet rset = stmt.executeQuery(sqlSelect);
            while(rset.next()) {
                rset.getInt("CustomerID");
                count++;
            }
            if (count<1){
                String sqlDelete="delete from customer where CustomerID = "+customer2.getId()+"";
                System.out.println("The SQL statement is: "+sqlDelete);
                int countDelete=stmt.executeUpdate(sqlDelete);
                System.out.println(countDelete+" records deleted.");
            }else {
                System.out.println("Can't delete\nthis id = "+customer2.getId()+" have order now !!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
    }
}

    private static void ex5_8(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from customer limit 0,100";
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("CustomerID") + ", "
                        + rset.getString("CustomerName") + ", "
                        + rset.getString("Address") + ", "
                        + rset.getString("Phone") + ", "
                        + rset.getString("Email") + ", ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


