public class Person {

    public int id;
    private String firstName;
    private String lastName;

    public Person(int i, String ivan, String petrov) {
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Person p = (Person) obj;
        return id == p.id && (firstName == p.firstName || (firstName != null && firstName.equals(p.firstName)) &&
                (lastName == p.lastName || (lastName != null && lastName.equals(p.lastName))));
    }
    public static void main(String[] args) {
        Person p1 = new Person(13, "Ivan", "Petrov");
        Person p2 = new Person(13, "Ivan", "Petrov");
        Object p3 = new Person(13, "Ivan", "Petrov");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

}
