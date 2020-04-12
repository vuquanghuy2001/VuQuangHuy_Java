package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mời nhập số bộ phim cần lập danh sách: ");
        int n=input.nextInt();
//      nhập tên các bộ phim
        System.out.println("Mời nhập lần lượt tên các bộ phim: ");
        List<String> listMovie=new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.println("Bộ Phim thứ "+(i+1)+":");
            String mv=input.next();
            listMovie.add(mv);
        }
        System.out.println("Bạn vừa nhập tên "+listMovie.size()+" bộ phim là:"+listMovie);

//        chỉnh sửa tên phim
        Scanner set=new Scanner(System.in);
        System.out.println("Mời bạn nhập thứ tự bộ phim bạn muốn sửa tên: ");
        int s=set.nextInt();
        System.out.println("Mời bạn nhập tên mới của bộ tên bạn muốn sửa: ");
        String ne=set.next();
        listMovie.set(s,ne);
        System.out.println("Danh sách tên phim mới là: "+listMovie);

//         xóa tên bộ phim
        Scanner remove=new Scanner(System.in);
        System.out.println("Mời bạn nhập số bộ phim bạn muốn xóa: ");
        int r=remove.nextInt();
        for (int j = 0; j<r; j++){
            System.out.println("Bộ Phim thứ "+(j+1)+":");
            String rm=input.next();
            boolean isRemove=listMovie.remove(rm);
            System.out.println("Danh sách các bộ phim sau khi xóa: "+listMovie);
        }
//        tìm kiếm tên phim
        Scanner get=new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ tự phim bạn muốn tìm kiếm: ");
        int g=get.nextInt();
        listMovie.get(g);
        System.out.println("Tên phim bạn tìm kiếm là: "+listMovie.get(g));
    }
}
