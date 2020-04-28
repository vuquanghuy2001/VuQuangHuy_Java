package baithi;

public class student {
    private String id;
    private String name;
    private String add;
    private int phone;

    public student(String id, String name, String add, int phone) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
