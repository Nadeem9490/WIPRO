package String;
import java.util.*;
public class Question12 {
	public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-", "[", "]");
        s1.add("NANDYAL");
        s1.add("RAJAMPETA");
        s1.add("KUROOL");
        StringJoiner s2 = new StringJoiner("-", "[", "]");
        s2.add("KADAPA");
        s2.add("TIRUPATI");
        StringJoiner merged1 = new StringJoiner("-", "[", "]");
        merged1.merge(s2);
        merged1.merge(s1);
        System.out.println("i) s1 merged to s2: " + merged1);
        StringJoiner merged2 = new StringJoiner("-", "[", "]");
        merged2.merge(s1);
        merged2.merge(s2);
        System.out.println("ii) s2 merged to s1: " + merged2);
    }
}