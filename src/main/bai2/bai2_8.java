package bai2;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class bai2_8{
    public static void main(String[] args) {
        List<User> User=new ArrayList<>();
        User.add(new User("Rajeev",25));
        User.add(new User("John",25));
        User.add(new User("Steve",29));

        User.forEach(bai2_8 -> {
            System.out.println("Name: "+bai2_8.getName()+",age: "+bai2_8.getAge());
        });
    }
}
