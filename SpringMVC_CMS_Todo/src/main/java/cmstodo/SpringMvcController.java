package cmstodo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SpringMvcController {
	CourseArrList csArr = new CourseArrList();
	
	@RequestMapping("/add-courses")
	public String addCourse(){
		return "addCourse";
	}
	
	@RequestMapping(value="/addCourse", method=RequestMethod.POST)
	public String doAdd(@RequestParam("cid") int courseId,
			@RequestParam("cname") String courseName,
			@RequestParam("provider") String provider,
			@RequestParam("duration") int duration,
			@RequestParam("cost") float price) {
		
		CourseDetails newCourse = new CourseDetails(courseId,courseName,provider,duration,price);
		
		csArr.add(newCourse);
		
//		String resultPage = "successfulAdded";
		String resultPage = "addCourse";
		
		return resultPage;
	}
	
//	@RequestMapping("/show-course")
//	public String showCourse(){
//		return "showCourse";
//	}
	
	
	@RequestMapping(value="/showCourse", method=RequestMethod.POST)
	public void getAll(
            HttpServletResponse response) {
		
		 response.setContentType("text/html");
		try {
			PrintWriter writer = response.getWriter();
			
			for (CourseDetails ele: csArr.courseArrList){
				writer.println("<h3>^^^^^^^^^^^^^^^^^^^Course Details ^^^^^^^^^^^^^^^^^^^^^^^^^</h3>");
				writer.println("<h3>CourseId: "+ ele.getCourseId()+"</h3>");
				writer.println("<h3>Course Name: "+ ele.getCourseName()+"</h3>");
				writer.println("<h3>Course Provider: "+ ele.getCourse_provider()+"</h3");
				writer.println("<h3>Course Duration : "+ ele.getCourse_duration()+" months</h3>");
				writer.println("<h3>Course Duration : Rs."+ ele.getCourse_cost()+"</h3>");
				writer.println("<h3>^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^</h3>");
		      }

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
	
	
	
}
