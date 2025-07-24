package String;
import java.util.*;

public class Question14 {
    public static void main(String[] args) {
        String address = null;
        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + result);
    }
}