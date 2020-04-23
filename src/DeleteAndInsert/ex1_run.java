package DeleteAndInsert;

public class ex1_run {
    private int BookID;
    private String BookName;
    private String AuthorName;
    private double Price;
    private int qty;

    public ex1_run(int bookID, String bookName, String authorName, double price, int qty) {
        BookID = bookID;
        BookName = bookName;
        AuthorName = authorName;
        Price = price;
        this.qty = qty;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        return "("+getBookID()+","+getBookName()+","+getAuthorName()+","+getPrice()+","+getQty()+")";
    }
}
