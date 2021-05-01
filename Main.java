package ödev3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setCourseinformation("JAVA + REACT");
		instructor.setCourse("Yazilim Gelistirici Yetistirici Kampı");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("ibrahim");
		student.setLastName("TURANCI");
		student.setEmail("ibrahim-turanci@hotmail.com");
		student.setAddress("Malatya/Merkez");
		student.setPassword("qwdasc");
		

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		instructorManager.addCourse(instructor);
		instructorManager.addCourseinformation(instructor);
		
		System.out.println("---------------");
		
		StudentManager studentManager=new StudentManager();
		studentManager.addUser(student);
		studentManager.addAdress(student);
		studentManager.addEmail(student);
		studentManager.editProfile(student);

		


	}

}
