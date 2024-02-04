package effigo.ayushi.learning;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "Effigo"),
				new Course(2, "Learn spring boot", "Effigo"),
				new Course(3, "Learn full stack", "Effigo"),
				new Course(4, "Learn sprint boot", "Effigo")
				);
		
	}

}
