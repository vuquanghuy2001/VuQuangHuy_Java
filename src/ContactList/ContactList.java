package ContactList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        List<Contact> list=new ArrayList<>();
//        list.add(new Contact("abc",1234));
//        list.add(new Contact("bcd",5678));
        int number=0;
        System.out.println("Available actions: ");
        System.out.println("press");
        System.out.println("0-to shutdown");
        System.out.println("1-to print contacts");
        System.out.println("2-to add a new contact");
        System.out.println("3-to update existing an existing contact");
        System.out.println("4-to remove an existing contact");
        System.out.println("5-query is an existing contact exists");
        System.out.println("6-to print a list pf available action.");
        System.out.println("Choose your action:");
        Scanner Case=new Scanner(System.in);
        System.out.println("Enter acction:");
        number=Case.nextInt();
        switch (number){
            case 0:
                break;
            case 1:
                System.out.println("Contact List:");
                for (int i=1;i<list.size();i++){
                    System.out.println(list);
                }
                break;
            case 2:
                Scanner add=new Scanner(System.in);
                System.out.println("Enter new contact name: ");
                String name=add.next();
                System.out.println("Enter phone number: ");
                String phone=add.next();
                System.out.println("New contact added: name="+name+",Phone="+phone);
                break;
            case 3:
                Scanner set=new Scanner(System.in);
                System.out.println("Enter existing contact name: ");
                String s=set.next();
                System.out.println("Enter new contact name: ");
                String n=set.next();
                System.out.println("Enter new contact number: ");
                String nu=set.next();
                System.out.println(n+",was replaced with "+nu);
                System.out.println(list);
                break;
            case 4:
                Scanner remove=new Scanner(System.in);
                System.out.println("Enter existing contact name: ");
                String rm=remove.next();
                boolean isRemove=list.remove(rm);
                System.out.println(rm+",was deleted");
                System.out.println("Successfully deleted");
                System.out.println(list);
                break;
            case 5:
                Scanner get=new Scanner(System.in);
                System.out.println("Enter existing contact name: ");
                int g=get.nextInt();
                list.get(g);
//                System.out.println("Name: "+list.get(g)+);
                break;
            case 6:
                System.out.println("");
        }
    }
}
