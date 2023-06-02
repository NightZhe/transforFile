import java.util.ArrayList;

import java.util.Iterator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class CallVector {
    public static void main(String[] args) {
        Vector v = new Vector();
        ArrayList a = new ArrayList();
        a.add(new Person("kevin", 20));
        a.add(new Person("steve", 30));

        Iterator it = a.iterator();

        while (it.hasNext()) {

            Person p = (Person) it.next();
            sop(p.getName() + "," + p.getAge());

        }
    }

    public static void sop(Object object) {
        System.out.println(object);
    }

}
