package bai2;

import java.util.ArrayList;
import java.util.List;

public class bai2_4 {
    public static void main(String[] args) {
        List<String> programminglanguages=new ArrayList<>();
        programminglanguages.add("C");
        programminglanguages.add("C++");
        programminglanguages.add("java");
        programminglanguages.add("Kotlin");
        programminglanguages.add("Python");
        programminglanguages.add("Perl");
        programminglanguages.add("Ruby");

        System.out.println("Initial List: "+programminglanguages);
        programminglanguages.remove(5);
        System.out.println("After remove(5): "+programminglanguages);

        List<String> scriptinglanguases=new ArrayList<>();
        scriptinglanguases.add("Python");
        scriptinglanguases.add("ruby");
        scriptinglanguases.add("Perl");

        programminglanguages.removeAll(scriptinglanguases);
        System.out.println("After removeAll(scriptinglanguases): "+programminglanguages);

        programminglanguages.removeIf(n->(n.charAt(0)=='T'));
        System.out.println("After Removing all element that start with \"c\": "+programminglanguages);

        programminglanguages.clear();
        System.out.println("After clear(): "+programminglanguages);
    }
}
