import java.util.HashMap;
import java.util.Objects;

public class HashAndEqualsMethod {
    public static void main(String [] args){
        HashMap<Person,String> map = new HashMap<>();
        Person p1 = new Person("Uday",1);
        Person p2= new Person("Kumar",2);
        Person p3 = new Person("Uday",1);

        map.put(p1,"firstname");// hashcode --> index1
        map.put(p2,"Second name");// hashcode --> index2
        map.put(p3,"Third name");// hashcode -->  index1 --> equals() --> replace

        System.out.println(map.size());
        System.out.println(map.get(p1));
        System.out.println(map.get(p3));



        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("uday",1);// hashcode --> index1
        map2.put("Kumar",2);// hashcode --> index2
        map2.put("uday",3);// hashcode --> index1

        System.out.println(map2.size());
        System.out.println(map2.get("uday"));
    }
}
class Person{
    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
