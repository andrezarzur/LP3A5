package funcional;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class set {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        System.out.println(transform(collection));
    }
    public static Set<String> transform(List<Person> collection) {
        return collection.stream().filter(person -> person.getAge() > 30).map(p -> p.getName()).collect(Collectors.toSet());
    }
}
