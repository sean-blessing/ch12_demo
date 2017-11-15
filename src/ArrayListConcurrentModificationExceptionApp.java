import java.util.ArrayList;

public class ArrayListConcurrentModificationExceptionApp {

	public static void main(String[] args) {
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("Eric");
		stringArray.add("Denise");
		stringArray.add("Lisa");
		stringArray.add("Bill");
		stringArray.add("Andrew");
		stringArray.add("Sean");
		stringArray.add("Joe");
		stringArray.add("Emilie");
		stringArray.add("Luke");
		
		for (String s: stringArray) {
			if (s.equalsIgnoreCase("sean")) {
				int idx = stringArray.indexOf("Sean");
				stringArray.set(idx, "Billy");
				//stringArray.remove(idx); would generate an exception
			}
			System.out.println(s);		
		}
		System.out.println("****** after modification ******");
		for (String s: stringArray) {
			System.out.println(s);
		}

	}

}
