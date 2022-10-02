package funcional;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class counting {
    public static void main(String[] args) {
        List<String> collection = asList("Viktor", "Farcic", "John", "Doe", "Third", "Robert", "Herbert");
        System.out.println(transform(collection));
    }
    public static Long transform(List<String> collection) {
        return collection.stream().collect(Collectors.counting());
    }
}
