package giftshop.giftview;

import giftshop.giftcontroller.GiftController;

import java.sql.*;
import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        int number;

        GiftController BookData = new GiftController(0,"","",0,0);

        System.out.println("chon 1 de hien thi toan bo sach trong thu vien.");
        System.out.println("chon 2 de nhap thong tin sach vao du lieu.");
        System.out.println("chon 3 roi nhap id cuon sach ban muon xoa.");
        Scanner inputx=new Scanner(System.in);
        System.out.println("nhap lenh cua ban: ");
        number=inputx.nextInt();
        switch (number){
            case 1:
                try (
                        Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                                "root", "");

                        Statement stmt = conn.createStatement();
                ) {

                    String strSelect = "select * from books";
                    System.out.println("The SQL statement is: " + strSelect);

                    ResultSet rset = stmt.executeQuery(strSelect);

                    System.out.println("The records selected are:");
                    int rowCount = 0;
                    while (rset.next()) {
                        int id = rset.getInt("id");
                        BookData.setId(id);
                        String title = rset.getString("title");
                        BookData.setTitle(title);
                        String author = rset.getString("author");
                        BookData.setAuthour(author);
                        double price = rset.getDouble("price");
                        BookData.setPrice(price);
                        int qty = rset.getInt("qty");
                        BookData.setQty(qty);
                        System.out.println(BookData.getId() + "," + BookData.getTitle() + ", " + BookData.getAuthour() + "," + BookData.getPrice() + ", " + BookData.getQty());
                        ++rowCount;

                    }
                    System.out.println("Total number of records = " + rowCount);

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                break;
            case 2:
                try (
                        Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                                "root", "");

                        Statement stmt = conn.createStatement();
                ) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("nhap id cua cuon sach: ");
                    int id = input.nextInt();
                    BookData.setId(id);
                    System.out.println("nhap ten cuon sach: ");
                    String bookname = input.next();
                    BookData.setTitle(bookname);
                    System.out.println("nhap ten tac gia: ");
                    String tentacgia = input.next();
                    BookData.setAuthour(tentacgia);
                    System.out.println("nhap so tien: ");
                    int sotien = input.nextInt();
                    BookData.setPrice(sotien);
                    System.out.println("nhap so luong: ");
                    int soluong = input.nextInt();
                    BookData.setQty(soluong);
                    String sqlInsert = "insert into books values (" + BookData.getId() + ",'" + BookData.getTitle() + "','" + BookData.getAuthour() + "'," + BookData.getPrice() + "," + BookData.getQty() + ")";
                    System.out.println("The SQL statement is: " + sqlInsert + "\n");
                    int countInserted = stmt.executeUpdate(sqlInsert);
                    System.out.println(countInserted + " records inserted.\n");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try (
                        Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                                "root", "");

                        Statement stmt = conn.createStatement();
                ) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter the id you want to delete: ");
                    int del = input.nextInt();
                    BookData.setId(del);
                    String sqlDelete = "delete from books where id = " + BookData.getId();
                    System.out.println("The SQL statement is: " + sqlDelete + "\n");
                    int countDeleted = stmt.executeUpdate(sqlDelete);
                    System.out.println(countDeleted + " records deleted.\n");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
        }
        }
    }



