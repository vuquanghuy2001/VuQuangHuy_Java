package DeleteAndInsert;

import java.sql.*;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {

//            xóa tất cả cuốn sách có id>800
            String sqlDelete = "delete from books where id >800";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");


            // Thêm cùng lúc 2 bản ghi
             String sqlInsert = "insert into books values "
                    + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                    + "(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            // Thêm 1 cuốn sách có thông tin là (2001, 'Java JDBC MySQL', 'ThiDK');
            sqlInsert = "insert into books (id, title, author) values (2001, 'Java JDBC MySQL', 'ThiDK')";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

//            Xoá một cuối sách có id là do người dùng nhập vào, ví dụ id = 2001
             sqlDelete = "delete from books where id =2001";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
             countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

//            Thêm mới một cuốn sách có đầy đủ thông tin do người dùng nhập vào từ bàn phím?
            ex1_run BookInput=new ex1_run(0,"","",0,0);
            Scanner input=new Scanner(System.in);
            System.out.println("nhap id cua cuon sach: ");
            int id=input.nextInt();
            BookInput.setBookID(id);
            System.out.println("nhap ten cuon sach: ");
            String bookname=input.next();
            BookInput.setBookName(bookname);
            System.out.println("nhap ten tac gia: ");
            String tentacgia=input.next();
            BookInput.setAuthorName(tentacgia);
            System.out.println("nhap so tien: ");
            int sotien=input.nextInt();
            BookInput.setPrice(sotien);
            System.out.println("nhap so luong: ");
            int soluong=input.nextInt();
            BookInput.setQty(soluong);
            sqlInsert="insert into books values ("+BookInput.getBookID()+",'"+BookInput.getBookName()+"','"+BookInput.getAuthorName()+"',"+BookInput.getPrice()+","+BookInput.getQty()+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            // Issue a SELECT to check the changes
            String strSelect = "select * from books";
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
