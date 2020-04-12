package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Handle {
    private int temperature;
    Scanner input = new Scanner(System.in);

    public int temperature() {
        temperature = input.nextInt();
        return temperature;
    }

    public int input() {
        int a = input.nextInt();
        return a;
    }

    public static class Temprature{
           public static void main(String[] args) {
            Handle handle = new Handle();
               List<Integer> tempratures = new ArrayList<>();
               System.out.println("Enter the number of days: ");
               int day = handle.input();
               System.out.println("Enter " + day + " integer value");
               for (int i = 0; i < day; i++) {
                   tempratures.add(handle.temperature());
               }
               for (int i = 0; i < tempratures.size(); i++) {
                   System.out.println("Element "+i+" ,typed value was "+ tempratures.get(i));
               }

               int sum=0;
               for (int item : tempratures){
                   sum=sum+item;
               }
               float avg=0;
               avg=sum/tempratures.size();
               System.out.println("Average is "+avg);
           }
       }
}
