package fr.ex.array;

import java.util.*;

public class Students {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, List<Integer>> studentMarks = new HashMap<>();
		
		// We add a break condition for our while loop
		boolean addMoreStudents = true;
	
		
		while (addMoreStudents) {
			System.out.println("Enter the first name and last name of the student: ");
			String firstName = scan.next();
			String lastName = scan.next();
			scan.nextLine();
	
			String fullName = firstName + " " + lastName;
			
			if (studentMarks.containsKey(fullName)) {
				System.out.println("\nStudent \"" + fullName + "\" already exists.");
                List<Integer> existingMarks = studentMarks.get(fullName);
                System.out.println("Marks: " + existingMarks);
                System.out.println("Mean: " + Notes.getAverage(existingMarks));
			}
			
			else {
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
				System.out.println("Student \"" + fullName + "\" added successfully.");
			}
			
			System.out.println("Do you want to add another studen? (y or n ) ? ");
			String choice = scan.nextLine().trim().toLowerCase();
			addMoreStudents = choice.equals("y");
			
		}
		// Display 
		System.out.println("\nStudent records:");
        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
        	List<Integer> marks = entry.getValue();
            System.out.println("Student: " + entry.getKey());
            System.out.println("Marks: " + entry.getValue());
            System.out.println("Mean: " + Notes.getAverage(marks)+ "\n");
        }
        
        scan.close();
	}

}
