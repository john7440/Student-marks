package fr.ex.array;

import java.util.*;

public class Students {
	// This our Students class, it contains methods to add
	// and display Students with their marks and mean.
	
	public static List<Integer> getValidMarks(Scanner scan, String fullName){
		// This method contains a loop to verify if the marks are correct,
		// and while they are not correct, it display an error message and ask for valid marks:
		List<Integer> marksList = new ArrayList<>();
		boolean validMarks = false;
		
		while (!validMarks) {
			System.out.println("Enter the marks (space separated) for " + fullName + ":");
			String marks = scan.nextLine();
			String[] marksArray = marks.trim().split("\\s+");
			
			marksList.clear();
			boolean allValid = true;
			
			for (String mark : marksArray) {
				try {
					int value = Integer.parseInt(mark);
					if (value >=0 && value <= 20) {
						marksList.add(value);
					} else {
						System.out.println("Invalid mark (must be between 0 and 20): " + value);
	                    allValid = false;
	                    break;
					}				
				} catch (NumberFormatException err) {
					System.out.println("Invalid input: " + mark);
	                allValid = false;
	                break;
				}
			}
			
			if (allValid && !marksList.isEmpty()) {
				validMarks = true;
			} else {
				System.out.println("Please re enter valid marks for " + fullName);
			}
			
		}
		return marksList;
				
	}
	
	public static String capitalize(String word) {
		// This method take a String and capitalize it:
		if (word == null || word.isEmpty()) return word;
		return	word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	}
	
	public static void displayStudentInfo(String name, List<Integer> notes) {
		// This method format the display of each student info:
		System.out.println("Student: " + name);
	    System.out.println("Marks: " + notes);
	    System.out.println("Mean: " + Notes.getAverage(notes)+ "\n");
	}
	
	
	public static void displaySortedAscending(Map<String, List<Integer>> studentMarks) {
		// This method is used to sort the student list in ascending order:
		System.out.println("\nStudents sorted by first name (ascending): ");
		studentMarks.entrySet().stream()
			.sorted(Comparator.comparing(entry -> entry.getKey().split(" ")[0]))
			.forEach(entry -> displayStudentInfo(entry.getKey(), entry.getValue()));
	}
	
	public static void displaySortedDescending(Map<String, List<Integer>> studentMarks) {
		// This method is used to sort the student list in descending order:
	    System.out.println("\nStudents sorted by first name (descending):");
	    studentMarks.entrySet().stream()
	        .sorted(Comparator.comparing((Map.Entry<String, List<Integer>> entry) -> entry.getKey().split(" ")[0]).reversed())
	        .forEach(entry -> displayStudentInfo(entry.getKey(), entry.getValue()));
	}

	
	public static void main(String[] args) {
		// This is our main method, it contains the main logic
		// of our code. Initiate a scan, a HashMap and a loop to
		// give the possibility to add more students. The it show
		// a menu for sorting and display accordingly.
		Scanner scan = new Scanner(System.in);
		Map<String, List<Integer>> studentMarks = new HashMap<>();
		
		// We add a break condition for our while loop
		boolean addMoreStudents = true;
	
		
		while (addMoreStudents) {
			System.out.println("Enter the first name and last name of the student: ");
			String firstName = scan.next();
			String lastName = scan.next();
			scan.nextLine();
			
			
			firstName = capitalize(firstName);
			lastName = capitalize(lastName);
			String fullName = firstName + " " + lastName;
			
			// If the student is already registered
			if (studentMarks.containsKey(fullName)) {
				System.out.println("\nStudent \"" + fullName + "\" already exists.");
				displayStudentInfo(fullName, studentMarks.get(fullName));
			}
			
			// Else, we can add a new student
			else {
				List<Integer> marksList = getValidMarks(scan, fullName);
				studentMarks.put(fullName, marksList);
				System.out.println("Student \"" + fullName + "\" added successfully.");
			}
			
			System.out.println("Do you want to add another student? (y or n ) ? ");
			String choice = scan.nextLine().trim().toLowerCase();
			addMoreStudents = choice.equals("y");
			
		}
		
		
		// This is our menu for sorting (or not) the Students with 1 or 2:
		System.out.println("\nHow would you like to sort the students?");
        System.out.println("1 - Sort by first name (ascending)");
        System.out.println("2 - Sort by first name (descending)");
        System.out.print("Enter your choice (1 or 2): ");
        String sortChoice = scan.nextLine().trim();

        if (sortChoice.equals("1")) {
            displaySortedAscending(studentMarks);
        } else if (sortChoice.equals("2")) {
            displaySortedDescending(studentMarks);
        } else {
            System.out.println("\nInvalid choice. Displaying unsorted records:");
            for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
                displayStudentInfo(entry.getKey(), entry.getValue());
            }
        }
        
        scan.close();
	}

}
