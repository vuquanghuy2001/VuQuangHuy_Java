package giftshop.giftcontroller;


public class GiftController {
    private int id;
    private String title;
    private String authour;
    private double price;
    private int qty;

    public GiftController(int id, String title, String authour, double price, int qty) {
        this.id = id;
        this.title = title;
        this.authour = authour;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

