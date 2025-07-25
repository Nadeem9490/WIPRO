package SET ;
import java.util.TreeSet;
public class Q4 {

		TreeSet<String> H1 = new TreeSet<>();
		public TreeSet<String> saveCountryNames(String CountryName){
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
		// TODO Auto-generated method stub	
		Q4 set = new Q4();
		set.saveCountryNames("India");
		set.saveCountryNames("Russia");
		System.out.println(set.getCountry("India"));
		System.out.println(set.getCountry("Russia"));
	}

}