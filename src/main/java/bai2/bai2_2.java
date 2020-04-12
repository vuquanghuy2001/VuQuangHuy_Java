package bai2;

import java.util.ArrayList;
import java.util.List;

public class bai2_2 {
    public static void main(String[] args) {
        List<Integer> firstFiveprimeNumbers=new ArrayList<>();
        firstFiveprimeNumbers.add(2);
        firstFiveprimeNumbers.add(3);
        firstFiveprimeNumbers.add(3);
        firstFiveprimeNumbers.add(5);
        firstFiveprimeNumbers.add(7);
        firstFiveprimeNumbers.add(11);

        List<Integer> nextFivePrimeNumbers=new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        firstFiveprimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstFiveprimeNumbers);
    }
}
