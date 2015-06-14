import java.util.*;
import java.io.*;

public class Driver {

    static Scanner in;
    static Gradebook stuy;
    static String helper = "";

    public static void add() {
	System.out.println("You have selected that you wish to add an object. Do you want to add a teacher, course, student, or grade? Type 'teacher', 'course', 'student', or 'grade', respectively, to select.");
	String add = in.nextLine().toLowerCase();
	System.out.println();
	switch (add) {
	case "teacher":
	    System.out.println("You are now going to add a teacher.");
	    System.out.println("Please type in the last name of the teacher");
	    String name = in.nextLine();
	    System.out.println();
	    System.out.println("Here is the teacher list for " + stuy.getName());
	    stuy.addTeacher(name);
	    System.out.println(stuy);
	    break;

	case "course":
	    System.out.println("You are now going to add a course. Please type in the following parameters:");
	    System.out.println("The teacher's last name");
	    String teacher = in.nextLine();
	    if (stuy.getTeacher(teacher) != null) {
		System.out.println("The course's name");
		String course = in.next();
		System.out.println("The number of students in the course");
		int num = in.nextInt();
		System.out.println();
		stuy.getTeacher(teacher).addCourse(course,num);
		System.out.println("Here is the new course list for " + stuy.getTeacher(teacher).getName());
		String newCourse = stuy.getTeacher(teacher).getCourses();
		System.out.println(newCourse);
	    } 
	    break;

	case "student":
	    System.out.println("You are now going to add a student. Please type in the following parameters:");
	    System.out.println("Their teacher's last name");
	    String teacher2 = in.nextLine();
	    if (stuy.getTeacher(teacher2) != null) {
		System.out.println("The course they are enrolled in");
		String course2 = in.nextLine();
		if (stuy.getTeacher(teacher2).findCourse(course2) != null) {
		    System.out.println("The student's name, in the form of last name, first name");
		    String student = in.nextLine();
		    System.out.println();
		    stuy.getTeacher(teacher2).findCourse(course2).addStudent(student);
		    System.out.println("Here is the new student list for " + stuy.getTeacher(teacher2).getName() + "'s course, " + stuy.getTeacher(teacher2).findCourse(course2).getName());
		    System.out.println(stuy.getTeacher(teacher2).findCourse(course2));
		} else {
		    System.out.println("We're sorry, but that course is not yet entered in the gradebook. Please try again.");
		}
	    } else {
		System.out.println("We're sorry, but that teacher is not yet entered in the gradebook. Please try again.");
	    }
	    break;

	case "grade":
	    System.out.println("You are now going to add a grade. Please type in the following parameters:");
	    System.out.println("The student's teacher's last name");
	    String teacher3 = in.nextLine();
	    System.out.println("The course they are enrolled in");
	    String course3 = in.nextLine();
	    System.out.println("The student's name, in the form of last name, first name");
	    String student3 = in.nextLine();
	    System.out.println("The assignment name/type (test, project, homework, etc)");
	    String assignment = in.nextLine();
	    System.out.println("The grade");
	    int grade = in.nextInt();
	    stuy.getTeacher(teacher3).findCourse(course3).addGrades(student3, assignment, grade);
	    System.out.println("Here is the new grade list for " + stuy.getTeacher(teacher3).findCourse(course3).findStudent(student3));
	    GradeList newGrade = stuy.getTeacher(teacher3).findCourse(course3).findStudent(student3).getGrades();
	    System.out.println(newGrade);
	    break;
	}
    }

    public static void find() {
	System.out.println("You have selected that you wish to find an object. Do you want to find a teacher, course, or student? Type 'teacher', 'course', or 'student', respectively, to select.");
	String find = in.nextLine().toLowerCase();
	System.out.println();
	switch (find) {
	    
	case "teacher":
	    System.out.println("You are now going to find a teacher. Please type in the last name of the teacher");
	    String findName = in.nextLine();
	    System.out.println();
	    if (stuy.getTeacher(findName) != null) {
		System.out.println("Here is " + stuy.getTeacher(findName).getName() + " and their courses");
		System.out.println(stuy.getTeacher(findName).getCourses());
	    } else {
		System.out.println("We're sorry, but that teacher is not yet entered in the gradebook. Please try again.");
	    }
	    break;
	case "course":
	    System.out.println("You are now going to find a course. Please type in the following parameters:");
	    System.out.println("The teacher's last name");
	    String findTeacher = in.nextLine();
	    System.out.println();
	    if (stuy.getTeacher(findTeacher) != null) {
		System.out.println("The course's name");
		String findCourse = in.nextLine();
		if (stuy.getTeacher(findTeacher).findCourse(findCourse) != null) {
		    System.out.println("Here is " + stuy.getTeacher(findTeacher).getName() + "'s course, " + findCourse);
		    System.out.println(stuy.getTeacher(findTeacher).findCourse(findCourse));
		} else {
		    System.out.println("We're sorry, but that course could not be found. Please try again.");
		}
	    } else {
		System.out.println("We're sorry, but that course is not yet entered in the gradebook. Please try again.");
	    }
	    break;
	case "student":
	    System.out.println("You are now going to find a student. Please type in the following parameters:");
	    System.out.println("Their teacher's last name");
	    String findTeacher2 = in.nextLine();
	    if (stuy.getTeacher(findTeacher2) != null) {
		System.out.println("The course they are enrolled in");
		String findCourse2 = in.nextLine();
		if (stuy.getTeacher(findTeacher2).findCourse(findCourse2) != null) {
		    System.out.println("The student's name, as it was inputted into the gradebook");
		    String findStudent2 = in.nextLine();
		    if (stuy.getTeacher(findTeacher2).findCourse(findCourse2).findStudent(findStudent2) != null) {
			System.out.println("Here is " + findStudent2 + "'s grades in " + findTeacher2 + "'s course, " + findCourse2);
			System.out.println(stuy.getTeacher(findTeacher2).findCourse(findCourse2).findStudent(findStudent2));
		    } else {
			System.out.println("We're sorry, but that student could not be found. Please try again.");
		    }
		} else {
		    System.out.println("We're sorry, but that course is not yet entered in the gradebook. Please try again.");
		}
	    } else {
		System.out.println("We're sorry, but that teacher is not yet entered in the gradebook. Please try again.");
	    }
	    break;
	}   
    }
    
    public static void main(String[] args) {
	in = new Scanner(System.in);
	stuy = new Gradebook("Stuyvesant");

	stuy.addTeacher("Zamansky");
	stuy.addTeacher("Brown-Mykolyk");
	stuy.addTeacher("Dyrland-Weaver");
	stuy.getTeacher("Zamansky").addCourse("APCS", 35);
	stuy.getTeacher("Zamansky").findCourse("APCS").addStudent("Stanton, Caitlin");
	stuy.getTeacher("Zamansky").findCourse("APCS").addStudent("Mattson, Michael");
	stuy.getTeacher("Zamansky").findCourse("APCS").addStudent("Doe, John"); 
	stuy.getTeacher("Zamansky").findCourse("APCS").addGrades("Doe, John", "Test", 92);
	stuy.getTeacher("Zamansky").findCourse("APCS").addGrades("Doe, John", "Final project", 95);

	System.out.println("Hello and welcome to StuyGrades, a gradebook designed by Caitlin Stanton and Michael Mattson!");
	System.out.println();
	boolean exit = false;
	while (exit == false) {
	    System.out.println();
	    int i = 0;
	    while (i % 2 == 0) {
		System.out.println("Would you like to add or find an object? Type 'add' for the former or 'find' for the latter. Type 'view' to see the gradebook as it currently exists. If you are done with the program, type 'done'");
		String action = in.nextLine().toLowerCase();
		System.out.println();
		if (action.equals("add")) {
		    add();
		    exit = false;
		    i = i + 2;
		} else if (action.equals("find")) {
		    find();
		    exit = false;
		    i = i + 2;
		} else if (action.equals("done")) {
		    System.exit(0);
        } else if (action.equals("view")){
            stuy.viewResults;
            exit = false;
            i = i + 2;
        }else {
		    i = i + 1;
		    System.out.println("We're sorry, but it appears that your command is invalid. Please try again.");
		}
	    }
	}
    }
}
