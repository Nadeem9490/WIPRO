package LIST;
import java.util.LinkedList;
import java.util.Collections;
public class Q5 {
	public static void main(String[] args) {
		LinkedList<String> months = new LinkedList<>();
		Collections.addAll(months, "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec");

		System.out.println(months);
	}
}