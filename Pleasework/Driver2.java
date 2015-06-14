import java.util.*;
import java.io.*;

public class Driver2 {

    static Scanner in;
    static Gradebook stuy;


    public static void add() {
	System.out.println("You have selected that you wish to add an object. Do you want to add a teacher, course, student, or grade? Type 'teacher', 'course', 'student', or 'grade', respectively");
	String add = in.nextLine();
	System.out.println();
	switch (add) {
	case "teacher":
	    System.out.println("You are now going to add a teacher. Please type in the last name of the teacher");
	    String name = in.nextLine();
	    stuy.addTeacher(name);
	    Collections.sort(stuy.teachers, stuy.teacherNameCompare);
	    System.out.println(stuy);
	    break;
	case "course":
	    System.out.println("You are now going to add a course. Please type in the following parameters:");
	    System.out.println("The teacher's last name");
	    String teacher = in.nextLine();
	    System.out.println("The course's name");
	    String course = in.next();
	    System.out.println("The number of students in the course");
	    int num = in.nextInt();
	    if (stuy.getTeacher(teacher) != null) {
		stuy.getTeacher(teacher).addCourse(course,num);
		System.out.println("Here is the new course list for " + teacher);
		ArrayList<Course> newCourse = stuy.getTeacher(teacher).getCourses();
		Collections.sort(newCourse, stuy.getTeacher(teacher).courseNameCompare);
		System.out.println(newCourse);
	    } else {
		System.out.println("We're sorry, but that teacher is not yet entered in the gradebook. Please try again.");
	    }
	    break;
	case "student":
	    System.out.println("You are now going to add a student. Please type in the following parameters:");
	    System.out.println("Their teacher's last name");
	    String teacher2 = in.nextLine();
	    System.out.println("The course they are enrolled in");
	    String course2 = in.nextLine();
	    System.out.println("The student's name, in the form of last name, first name");
	    String student = in.nextLine();
	    stuy.getTeacher(teacher2).findCourse(course2).addStudent(student);
	    System.out.println("Here is the new student list for " + teacher2 + "'s course, " + course2);
	    String newStudents = stuy.getTeacher(teacher2).findCourse(course2).getStudents();
	    System.out.println(newStudents);
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
	    System.out.println("Here is the new grade list for " + student3);
	    GradeList newGrade = stuy.getTeacher(teacher3).findCourse(course3).findStudent(student3).getGrades();
	    System.out.println(newGrade);
	    break;
	}
    }

    public static void find() {
	System.out.println("You have selected that you wish to find an object. Do you want to add a teacher, course, student, or grade? Type 'teacher', 'course', or 'student', respectively");
	String find = in.nextLine();
	System.out.println();
	switch (find) {
	    
	case "teacher":
	    System.out.println("You are now going to find a teacher. Please type in the last name of the teacher");
	    String findName = in.nextLine();
	    if (stuy.getTeacher(findName) != null) {
		System.out.println("Here is " + findName + " and their courses");
		System.out.println(stuy.getTeacher(findName));
	    } else {
		System.out.println("We're sorry, but that teacher is not yet entered in the gradebook. Please try again.");
	    }
	    break;
	case "course":
	    System.out.println("You are now going to find a course. Please type in the following parameters:");
	    System.out.println("The teacher's last name");
	    String findTeacher = in.nextLine();
	    System.out.println("The course's name");
	    String findCourse = in.nextLine();
	    if (stuy.getTeacher(findTeacher) != null) {
		if (stuy.getTeacher(findTeacher).findCourse(findCourse) != null) {
		    System.out.println("Here is " + findTeacher + "'s course, " + findCourse);
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
	    System.out.println("The course they are enrolled in");
	    String findCourse2 = in.nextLine();
	    System.out.println("The student's name, as it was inputted into the gradebook");
	    String findStudent2 = in.nextLine();
	    if (stuy.getTeacher(findTeacher2) != null) {
		if (stuy.getTeacher(findTeacher2).findCourse(findCourse2) != null) {
		    if (stuy.getTeacher(findTeacher2).findCourse(findCourse2).findStudent(findStudent2) != null) {
			System.out.println("Here is " + findStudent2 + "'s grades in " + findTeacher2 + "'s course, " + findCourse2);
			System.out.println(stuy.getTeacher(findTeacher2).findCourse(findCourse2));
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
	stuy = new Gradebook();

	stuy.addTeacher("Zamansky");
	stuy.addTeacher("EMILY IS WEIRD");
	stuy.addTeacher("Caitliiin");
	stuy.getTeacher("Zamansky").addCourse("CS", 35);
	stuy.getTeacher("Zamansky").findCourse("CS").addStudent("A");
	stuy.getTeacher("Zamansky").findCourse("CS").addStudent("B");
	stuy.getTeacher("Zamansky").findCourse("CS").addStudent("C"); 
	stuy.getTeacher("Zamansky").findCourse("CS").addGrades("A", "blah", 109);

	System.out.println("Hello and welcome to StuyGrades, a gradebook designed by Caitlin Stanton and Michael Mattson!");
	System.out.println();
	
	boolean exit = false;
	while (exit == false) {
	    System.out.println("Would you like to add or find an object? Type 'add' for the former or 'find' for the latter. If you are done with the program, type 'done'");
	    String action = in.nextLine();
	    if (action.equals("add")) {
		add();
	    } else if (action.equals("find")) {
		find();
	    } else if (action.equals("done")) {
		exit = true;
		System.exit(0);
	    } else {
		System.out.println("We're sorry, but your command is invalid. Please try again.");
						   }
						   }
						   }
						   }
