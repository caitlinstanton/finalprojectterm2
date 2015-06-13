import java.util.*;
import java.io.*;

public class Driver2 {

    public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
	Gradebook stuy = new Gradebook();
	


	stuy.addTeacher("Zamansky");
	stuy.addTeacher("EMILY IS WEIRD");
	stuy.addTeacher("Caitliiin");
	stuy.getTeacher("Zamansky").addCourse("CS", 35);
	stuy.getTeacher("Zamansky").findCourse("CS").addStudent("A");
	stuy.getTeacher("Zamansky").findCourse("CS").addStudent("B");
	stuy.getTeacher("Zamansky").findCourse("CS").addStudent("C"); 
	stuy.getTeacher("Zamansky").findCourse("CS").addGrades("A", "blah", 109);
	//System.out.println(stuy.getTeacher("Zamansky").getCourses());

	System.out.println("Hello and welcome to StuyGrades, a gradebook designed by Caitlin Stanton and Michael Mattson!");

	System.out.println("Would you like to add or find an object? Type 'add' for the former or 'find' for the latter. If you are done with the program, type 'done'");
	String action = in.nextLine();
	while (!(action.equals("done"))) {
	    switch (action) {
	    case "add":
		System.out.println("You have selected that you wish to add an object. Do you want to add a teacher, course, student, or grade? Type 'teacher', 'course', 'student', or 'grade', respectively");
		String add = in.nextLine();
		switch (add) {
		case "teacher":
		    System.out.println("You are now going to add a teacher. Please type in the last name of the teacher");
		    String name = in.nextLine();
		    stuy.addTeacher(name);
		    System.out.println(stuy);
		    break;
		case "course":
		    System.out.println("You are now going to add a course. Please type in the following parameters:");
		    System.out.println("The teacher's last name");
		    String teacher = in.nextLine();
		    Teacher agh = stuy.getTeacher(teacher);
		    
		    boolean hasTeacher = false;
		    for (int i = 0; i < stuy.teachers.size(); i++) {
			if (stuy.teachers.get(i).getName().equals(teacher)) {
			    hasTeacher =  true;
			}
		    }

		    System.out.println(hasTeacher);

		    System.out.println(agh);
		    System.out.println("The course's name");
		    String course = in.next();
		    System.out.println("The number of students in the course");
		    int num = in.nextInt();
		    System.out.println(stuy.getTeacher(teacher).getCourses());
		    if (stuy.getTeacher(teacher) != null) {
			stuy.getTeacher(teacher).addCourse(course,num);
			System.out.println("Here is the new course list for " + teacher);
			ArrayList<Course> newCourse = stuy.getTeacher(teacher).getCourses();
			System.out.println(newCourse);
		    } else {
			System.out.println("We're sorry, but that teacher is not yet entered in the gradebook. Please try again.");
		    }
		    break;
		case "student":
		    System.out.println("You are now going to add a student. Please type in the following parameters:");
		    System.out.println("Their teacher's last name");
		    String teacher2 = in.nextLine();
		    Teacher toTeacher = stuy.getTeacher(teacher2);
		    System.out.println("The course they are enrolled in");
		    String course2 = in.nextLine();
		    Course inCourse = toTeacher.findCourse(course2);
		    System.out.println("The student's name, in the form of last name, first name");
		    String student = in.nextLine();
		    inCourse.addStudent(student);
		    System.out.println("Here is the new student list for " + teacher2 + "'s course, " + course2);
		    ArrayList<Student> newStudents = inCourse.getStudents();
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
		    break;
		default:
		    System.out.println("agh");
		    break;
		}


	    case "find":
		System.out.println("You are now going to find a teacher. Please type in the last name of the teacher");
		String find = in.nextLine();
		ArrayList<Course> course = stuy.getTeacher(find).getCourses();
		System.out.println(course);
		break;
	    case "done":
		System.exit(0);
		break;
	    default:
		System.out.println("We're sorry, but your command is invalid. Please try again.");
	    break;
	    }
	    action = in.nextLine();

	}
	
    }
}
