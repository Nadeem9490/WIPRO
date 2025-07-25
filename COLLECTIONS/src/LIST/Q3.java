package LIST;
import java.util.ArrayList;
import java.util.Iterator;
public class Q3 {

	public static void printAll(ArrayList<String> list) {
		Iterator<String> iterator = list.iterator();
		System.out.println("All elements in the ArrayList:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("NADEEM");
		names.add("JANIFA");
		names.add("P");
		printAll(names);
	}
} 