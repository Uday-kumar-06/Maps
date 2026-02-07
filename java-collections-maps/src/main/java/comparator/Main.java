package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String s1 , String s2){
//        return -1;
//    }
//}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2){
        return o2-o1;
    }
}

public class Main {
    public static  void main(String [] args){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);

        list.sort(null);
        System.out.println(list);
        list.sort((a,b)-> b-a);

        System.out.println(list);

        List<String> list1 = Arrays.asList("banana","apple","date");
        list1.sort(null);
        System.out.println(list1);
        list1.sort((a,b) -> b.compareTo(a));

        System.out.println(list1);
    }
}
