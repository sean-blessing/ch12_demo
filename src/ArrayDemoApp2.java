import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemoApp2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Collection Framework");
		
		doNewArrays2();
		
		System.out.println("Bye");

	}

	public static void doNewArrays2() {
		ArrayList<String> students = new ArrayList<>();
		students.add("Eric");
		students.add("Luke");
		students.add("Bill");
		students.add("Lisa");
		students.add("Denise");
		students.add("Andrew");
		students.add("Emilie");
		students.add("Joe");
		
		for (String s : students) {
			System.out.println("Student"+students.indexOf(s)+" name [jdk1.7]= "+s);
		}
		
		System.out.println("No for loop: "+students);
		
		if (students.contains("Lisa")) 
			System.out.println("Lisa's here!");
		if (students.contains("Sean"))
			System.out.println("Sean's here!");
		
		System.out.println(students.indexOf("Joe"));
		System.out.println(students.get(2));
		
		//students.set(1, "Bob");
		System.out.println(students);
		
		Collections.sort(students, Collections.reverseOrder());
		
		System.out.println("sorted students:  "+students);
		
		Collections.shuffle(students);
		
		System.out.println("shuffled students:  "+students);
		
		students.remove("Joe");
		System.out.println(students);
		
	}
	
	public static void doNewArrays() {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Eric");
		students.add("Luke");
		students.add("Bill");
		students.add("Lisa");
		students.add("Denise");
		students.add("Andrew");
		students.add("Emilie");
		students.add("Joe");
		
		for (String s : students) {
			System.out.println("Student name [jdk1.5]= "+s);
		}
		
	}
	public void doOldSchoolArrays() {
		ArrayList students = new ArrayList();
		students.add("Eric");
		students.add("Luke");
		students.add("Bill");
		students.add("Lisa");
		students.add("Denise");
		students.add("Andrew");
		students.add("Emilie");
		students.add("Joe");
		
		for (int i=0; i<students.size();i++) {
			String str = (String)students.get(i);
			System.out.println("Student name = "+str);
		}
		
	}
}
