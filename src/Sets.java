import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Nick");
        names.add("Ivan");
        names.add("Vasily");
        names.add("Nick");

        for (String name : names) {
            System.out.println(name);
        }

        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person(20, "Ivan", "Ivanov"));
        persons.add(new Person(20, "Sidor", "Sidorov"));
        persons.add(new Person(20, "Oleg", "Drozdov"));

        for (Person p : persons) {
            System.out.println(p);
        }

        TreeSet<Person> persons2 = new TreeSet<>();
        persons2.add(new Person(20, "Ivan", "Ivanov"));
        persons2.add(new Person(50, "Sidor", "Sidorov"));
        persons2.add(new Person(10, "Oleg", "Drozdov"));

        for (Person p : persons2) {
            System.out.println(p);
        }

    }
}
