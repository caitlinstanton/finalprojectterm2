public class Driver2 {

    public static void main(String[] args) {	
	Gradebook stuy = new Gradebook();
	stuy.addTeacher("Zamansky");
	stuy.addTeacher("EMILY IS WEIRD");
	stuy.addTeacher("Caitliiin");

	System.out.println(stuy);

	System.out.println();

	stuy.getTeacher("Zamansky").add("C", 35);
	System.out.println(stuy.getTeacher("Zamansky").getCourse());

	System.out.println();

	stuy.getTeacher("Zamansky").findCourse("C").addStudent("A");
	stuy.getTeacher("Zamansky").findCourse("C").addStudent("B");
	stuy.getTeacher("Zamansky").findCourse("C").addStudent("C"); 
	System.out.println(stuy.getTeacher("Zamansky").findCourse("C").getStudents());   

	System.out.println();

	stuy.getTeacher("Zamansky").findCourse("C").addGrades("A", "blah", 109);

	System.out.println(stuy.getTeacher("Zamansky").findCourse("C").getStudents());   

    }

}
