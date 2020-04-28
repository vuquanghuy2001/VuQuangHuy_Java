package baithi;

import java.sql.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Menu*****");
        System.out.println("1. thực hiện chức năng thêm");
        System.out.println("2.thực hiện chức năng hiển thị");
        System.out.println("3. thực hiện chức năng lưu");
        System.out.println("4.thoát ra");
        System.out.println("mời bạn chọn menu: ");
        number = scanner.nextInt();
        switch (number) {
            case 1:
            insert();
            break;
            case 2:
            select();
            break;
            case 3:
                display();
                break;
            case 4:
                System.exit(1);
            default:
                System.out.println("bạn phải nhập số trong khoảng từ 1-3.");
        }
    }

    //           thực hiện chức năng thêm
    private static void insert(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            student hocsinh=new student("","","",0);
            Scanner input=new Scanner(System.in);
            System.out.println("mời bạn nhập các thông tin về học sinh: ");
            System.out.println("mời bạn nhập mã học sinh: ");
            String id=input.nextLine();
            hocsinh.setId(id);
            System.out.println("mời bạn nhập tên học sinh: ");
            String name=input.nextLine();
            hocsinh.setName(name);
            System.out.println("mời bạn nhập địa chỉ của học sinh: ");
            String add=input.nextLine();
            hocsinh.setAdd(add);
            System.out.println("mời bạn nhập số điện thoại của học sinh: ");
            int phone=input.nextInt();
            hocsinh.setPhone(phone);

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

//    thực hiện chức năng hiển thị
    private static void select(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strSelect="select * from student";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getString("StudentID") + ", "
                        + rset.getString("StudentName") + ", "
                        + rset.getString("Address") + ", "
                        + rset.getInt("Phone"));
            }

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

//    thực hiện chức năng lưu
    private static void display() throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            student hocsinh=new student("","","",0);

            stmt.executeUpdate("INSERT INTO student VALUES ("+"'"+hocsinh.getId()+"', '"+hocsinh.getName()+"', '"+hocsinh.getAdd()+"', "+hocsinh.getPhone()+")");
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void exit(){

    }
}
