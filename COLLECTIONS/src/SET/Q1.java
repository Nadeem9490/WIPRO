package SET;
import java.util.HashSet;
public class Q1 {
	HashSet<String> H1 = new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName){
		H1.add(CountryName);	
		return H1;
	}
	public String getCountry(String CountryName) {
		if(H1.contains(CountryName)) {
			return CountryName;
		}
		return null;
	}
	public static void main(String[] args) {
		Q1 set = new Q1();
		set.saveCountryNames("India");
		set.saveCountryNames("Russia");
		System.out.println(set.getCountry("India"));
		System.out.println("Russia");
	}
	
}