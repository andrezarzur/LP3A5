package funcional;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class list {
    public static void main(String[] args) {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        System.out.println(transform(collection));
    }
    public static List<String> transform(List<List<String>> collection) {
        return collection.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
    }
}
