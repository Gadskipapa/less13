import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String nick = "Nick";
        String ivan = "Ivan";
        String vasily = "Vasily";
        names.add(nick);
        names.add(ivan);
        names.add(vasily);
        names.add("Stephen");
        System.out.println(names.size());
        System.out.println(names.get(3));

        if (names.contains("Ivan")) {
            System.out.println("Hello Ivan");
        }
        System.out.println(names.remove(2));
        System.out.println(names.remove("Dmitry"));

        for (String name : names) {
            System.out.println(name);
        }
        for (String name : names) {
            if ("Ivan".equals(name)) {
                names.remove(name);
            }
        }

        Iterator <String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            String name = namesIterator.next();
            if ("Nick".equals(name)){
                namesIterator.remove();
            }
        }

        LinkedList<String> linkedNames = new LinkedList<>();
        linkedNames.add(nick);
        linkedNames.add(ivan);
        linkedNames.add(vasily);
        linkedNames.addFirst("Olga");
        linkedNames.addLast("Helga");
        linkedNames.removeLast();
        linkedNames.get(2);
    }
}
