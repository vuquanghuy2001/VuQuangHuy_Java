package bai2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class bai2_5 {
    public static void main(String[] args) {
        List<String> tvShows=new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");

        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        tvShows.forEach(tvShow->{
            System.out.println(tvShow);
        });
        System.out.println("\n=== Interate using an iterator() ===");
        Iterator<String> tvShowInterator=tvShows.iterator();
        while (tvShowInterator.hasNext()){
            String tvShow =tvShowInterator.next();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        ListIterator<String> tvShowListIterator=tvShows.listIterator(tvShows.size());
        while (tvShowInterator.hasNext()){
            String tvShow=tvShowInterator.next();
            System.out.println(tvShow);
        }
        System.out.println("\n Iterate using simple for-each loop===");
        for (String tvShow: tvShows){
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i=0;i<tvShows.size();i++){
            System.out.println(tvShows.get(i));
        }
    }
}
