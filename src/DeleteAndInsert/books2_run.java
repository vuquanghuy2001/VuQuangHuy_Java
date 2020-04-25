package DeleteAndInsert;

public class books2_run {
    private int id;
    private String name;
    private String author;
    private int price;
    private int qty;
    private String category;
    private String status;

    public books2_run(int id, String name, String author, int price, int qty, String category, String status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
        this.category = category;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
