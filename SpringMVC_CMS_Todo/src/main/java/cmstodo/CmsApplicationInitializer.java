package cmstodo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CmsApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
		AnnotationConfigWebApplicationContext annoCtx = 
				new AnnotationConfigWebApplicationContext();
		
		annoCtx.setConfigLocation("cmstodo");
		
		DispatcherServlet frontController = new DispatcherServlet(annoCtx);
		
		ServletRegistration.Dynamic registration =
				servletContext.addServlet("frontControllerServlet",frontController);
		
		registration.addMapping("/");
	}

}
