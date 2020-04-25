package book;

public class customer_run {
    private int id;
    private String name;
    private String email;
    private int phone;
    private String add;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public customer_run(int id, String name, String email, int phone, String add) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.add = add;


    }
}
