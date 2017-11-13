import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
	
	private static HashMap<String, User> users = new HashMap<>();

	public static void main(String[] args) {
		System.out.println("Hello");
		
		populateMap();
		
		for (Map.Entry user: users.entrySet()) {
			System.out.println("User key: "+user.getKey()+
								", user value: "+user.getValue());
			
		}
		String uString = "";
		while (!uString.equalsIgnoreCase("exit")) {
			uString = Console.getString("username?:  ");
			
			System.out.println("user selected:  "+users.get(uString));
		}
		System.out.println("Bye");
	}

	public static void populateMap() {
		User u1 = new User(0, "sblessing", "pwd", "Sean", "Blessing",
							"513-600-7096","sblessing@test.com", false,false);
		User u2 = new User(1, "bmandella", "pwd", "Bill", "Mandella",
				"513-222-2222","bmandella@test.com", false,false);
		User u3 = new User(2, "dclark", "pwd", "Denise", "Clark",
				"513-888-8888","dclark@test.com", false,false);
		
		users.put(u1.getUserName(), u1);
		users.put(u2.getUserName(), u2);
		users.put(u3.getUserName(), u3);
	}
}