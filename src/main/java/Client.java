import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaetraining.spring.bean.Student;
import com.javaetraining.spring.service.StudentService;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = context.getBean("studentService", StudentService.class);
		
		Student student = context.getBean("student", Student.class);
		System.out.println("Student : " + student);
		
		System.out.println(studentService.saveStudent(student));
		((ClassPathXmlApplicationContext) context).close();

	}

}