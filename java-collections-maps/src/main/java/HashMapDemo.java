import java.util.HashMap;
import java.util.Map;

public class HashMapDemo{
    public static void main(String [] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Akshit");
        map.put(2,"uday");
        map.put(3,"Kella");


        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
            entry.setValue("20");
            System.out.println(entry.hashCode());
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
