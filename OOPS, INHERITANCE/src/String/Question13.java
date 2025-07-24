package String;
import java.util.*;
public class Question13 {
    public static void main(String[] args) {
        String names[] = new String[5];
        Optional<String> optionalName = Optional.ofNullable(names[0]);
        int length = optionalName.map(String::length).orElse(0);
        System.out.println("Length: " + length);
    }
}