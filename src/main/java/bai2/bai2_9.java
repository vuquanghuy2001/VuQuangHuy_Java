package bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bai2_9 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(28);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before: "+numbers);

        Collections.sort(numbers);
        System.out.println("After: "+numbers);
    }
}
