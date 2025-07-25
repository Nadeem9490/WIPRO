package SET;
import java.util.Iterator;
import java.util.HashSet;
public class Q2 {
	public static void main(String[] args) {
		HashSet<String> empNames = new HashSet<>();
		empNames.add("NADEEM");
		empNames.add("JANIFA");
		empNames.add("SONA");
		
		
		
		Iterator<String> iterator = empNames.iterator();
		System.out.println("Employee Names: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}