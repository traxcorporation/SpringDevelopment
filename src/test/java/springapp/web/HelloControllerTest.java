package springapp.web;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

/**
 * //Testing is a vital part of software development.
 * 
 * <pre>
 * La classe <b>HelloControllerTest</b> test si le contrôleur renvoie 
 * bien le model de la vue de la classe <b>HelloController</b>.
 * </pre>
 * 
 * @author ytraore
 *
 */

/**
public class HelloControllerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testHandleRequest() throws Exception {

		// Prepare
		final HelloController helloControllerTest = new HelloController();
		// Test
		final ModelAndView modelAndView = helloControllerTest.handleRequest(null, null);
		// Verify

		assertEquals("Retour du nom de la vue", "hello.jsp", modelAndView.getViewName());
		assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
		final String nowValue = (String) modelAndView.getModel().get("now");
		assertNotNull(nowValue);

	}

}
*/