import java.util.*;

public class Students {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, List<Integer>> studentMarks = new HashMap<>();
		
		System.out.println("Enter the first name and last name of the student: ");
		String firstName = scan.next();
		String lastName = scan.next();
		scan.nextLine();

		String fullName = firstName + " " + lastName;
		
		System.out.println("Enter the marks (space separated) for " + fullName);
		String marks = scan.nextLine();
		String[] marksArray = marks.split(" ");
		
		List<Integer> marksList = new ArrayList<>();
		for (String mark: marksArray) {
			try {
				int value = Integer.parseInt(mark);
				marksList.add(value);
				
			} catch (NumberFormatException err){
				System.out.println("Invalid Input.");
			}
		
		}
		
		studentMarks.put(fullName, marksList);
		
		System.out.println("\nStudent records:");
        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
            System.out.println("Student: " + entry.getKey());
            System.out.println("Marks: " + entry.getValue());
        }
        
        scan.close();
	}

}
