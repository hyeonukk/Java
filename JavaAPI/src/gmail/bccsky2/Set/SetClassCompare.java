package gmail.bccsky2.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String>	treeSet = new TreeSet<>();

		hashSet.add("LG EDS");
		linkedHashSet.add("LG EDS");
		treeSet.add("LG EDS");

		hashSet.add("SAMSUNG");
		linkedHashSet.add("SAMSUNG");
		treeSet.add("SAMSUNG");
		
		hashSet.add("SK");
		linkedHashSet.add("SK");
		treeSet.add("SK");
		
		hashSet.add("KT");
		linkedHashSet.add("KT");
		treeSet.add("KT");
	}
	
	
}
