import java.util.HashMap;
import java.util.Map;

public class HashMapCompute {
    public static void main(String []args){
        Map<String, Integer> emplSalaryDate = new HashMap<String, Integer>();
        emplSalaryDate.put("Java",1000);
        emplSalaryDate.put("hi",1100);
        emplSalaryDate.put("hello",1200);
        emplSalaryDate.put("Uday",null);

        emplSalaryDate.compute("Java", (k,v) -> v=v+100);

//        emplSalaryDate.computeIfPresent("Uday", (k,v) -> v=v+100);

        emplSalaryDate.computeIfAbsent("Uday", (k) -> 1000 );

        emplSalaryDate.values().forEach(System.out::println);
    }

}
