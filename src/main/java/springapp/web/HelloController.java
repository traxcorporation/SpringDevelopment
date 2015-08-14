package springapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * This is my @see First Spring WebApp
 * 
 * @author ytraore
 *
 */
public class HelloController implements Controller {

	protected final Log logger = LogFactory.getLog(HelloController.class);

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		logger.info("Retuning hello view");
		return new ModelAndView("hello.jsp");
	}

}
