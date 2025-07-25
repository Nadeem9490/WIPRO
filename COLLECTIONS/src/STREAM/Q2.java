package STREAM;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Q2 {

	

	

		public static void main(String[] args) {
			ArrayList<Q2B> list = new ArrayList<>();
			list.add(new Q2B(123,"Sai",21,"Ongole"));
			list.add(new Q2B(456,"Bhupathi",21,"Punjab"));
			list.add(new Q2B(789,"Rajiv",25,"Pune"));
			list.add(new Q2B(112,"Raju",24,"Pune"));
			list.add(new Q2B(113,"Ravi",26,"Pune"));
			ArrayList<Q2B> location = list.stream().filter(emp -> emp.location.equals("Pune")).collect(Collectors.toCollection(ArrayList::new));
			location.forEach(System.out::println);
		}
}