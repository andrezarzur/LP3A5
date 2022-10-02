package funcional;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class joining {
    public static void main(String[] args) {
        List<String> collection = asList("Viktor", "Farcic", "John", "Doe", "Third");
        System.out.println(transform(collection));
    }
    public static String transform(List<String> collection) {
        return collection.stream().collect(Collectors.joining(" - "));
    }
}
