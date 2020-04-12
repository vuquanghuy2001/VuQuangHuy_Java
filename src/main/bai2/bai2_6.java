package bai2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bai2_6 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);

        Iterator<Integer> integerIterator=numbers.iterator();
        while (integerIterator.hasNext()){
            Integer num=integerIterator.next();
            if (num%2 != 0){
                integerIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
