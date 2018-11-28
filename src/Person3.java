class Person3 implements Comparable <Person> {

    @Override
    public int compareTo (Person o) {
        if (id > o.id) {
            return 1
        }
        if (id < o.id) {
            return -1;
        }
        return 0;
    }
}
