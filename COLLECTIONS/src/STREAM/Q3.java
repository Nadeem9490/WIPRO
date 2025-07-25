package STREAM;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Q3 {

	public static void main(String[] args) {
		ArrayList<Q3B> list = new ArrayList<>();
		list.add(new Q3B(111,"Sai",100));
		list.add(new Q3B(112,"Ram",90));
		list.add(new Q3B(113,"Prabhas",95));
		list.add(new Q3B(114,"Arjun",90));
		list.add(new Q3B(115,"Mahesh",89));
		ArrayList<Q3B> passed = list.stream().filter(n -> n.marks >= 50).collect(Collectors.toCollection(ArrayList::new));
		passed.forEach(System.out::println);
		System.out.println("Number of passed Stream3b: " + passed.size());
	}

}