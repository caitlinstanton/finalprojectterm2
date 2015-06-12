import java.util.*;
import java.io.*;

public class Driver2 {

    public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
	Gradebook stuy = new Gradebook();
	


	stuy.addTeacher("Zamansky");
	stuy.addTeacher("EMILY IS WEIRD");
	stuy.addTeacher("Caitliiin");
	stuy.getTeacher("Zamansky").add("C", 35);
	stuy.getTeacher("Zamansky").findCourse("C").addStudent("A");
	stuy.getTeacher("Zamansky").findCourse("C").addStudent("B");
	stuy.getTeacher("Zamansky").findCourse("C").addStudent("C"); 
	stuy.getTeacher("Zamansky").findCourse("C").addGrades("A", "blah", 109);
	System.out.println(stuy.getTeacher("Zamansky").getCourse());

	System.out.println("Hello and welcome to StuyGrades, a gradebook designed by Caitlin Stanton and Michael Mattson!");
	System.out.println("Would you like to add a teacher or find a teacher? Type 'add' for the former or 'find'.");
	String action = in.nextLine();
	switch (action) {
	case "add":
	    System.out.println("You are now going to add a teacher. Please type in the last name of the teacher.");
	    String add = in.nextLine();
	    stuy.addTeacher(add);
	    System.out.println(stuy);
	    break;
	case "find":
	    System.out.println("You are now going to find a teacher. Please type in the last name of the teacher.");
	    String find = in.nextLine();

	    //WHYYYYYYYYYYYYYYYYYYYYYYYYYYYY
	    System.out.println(stuy.getTeacher("Zamansky").getCourse());

	    break;
	default:
	    System.out.println("Please try again");
	    break;
	}

    }

}
