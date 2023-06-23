package cmstodo;

import java.util.ArrayList;
import java.util.List;

public class CourseArrList {
	ArrayList<CourseDetails> courseArrList = new ArrayList<>();
//  CmsDetails[] courseArr = new CmsDetails[3];


  public void add(CourseDetails cs){
      courseArrList.add(cs);
  }

  public  void dispDetails(ArrayList<CourseDetails> courseArrList){
      for (CourseDetails ele: courseArrList){
          System.out.println("^^^^^^^^^^^^^^^^^^^Course Details ^^^^^^^^^^^^^^^^^^^^^^^^^");
          System.out.println("CourseId: "+ ele.getCourseId());
          System.out.println("Course Name: "+ ele.getCourseName());
          System.out.println("Course Provider: "+ ele.getCourse_provider());
          System.out.println("Course Duration : "+ ele.getCourse_duration()+" months");
          System.out.println("Course Duration : Rs."+ ele.getCourse_cost());
          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      }
  }

}
