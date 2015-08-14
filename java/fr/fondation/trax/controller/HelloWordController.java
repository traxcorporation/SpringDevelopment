package fr.fondation.trax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.portlet.ModelAndView;

/**
 * 
 * @author ytraore
 *<pre>La classe retourne une instance du Model et de la vueavec le nom
 *du Mapping</pre>
 */
@Controller
public class HelloWordController {

	
	@RequestMapping("/hello")
	public ModelAndView helloWord(){
		final String Message = "BIENVENUE SUR SPRING J2EE";
		return new ModelAndView("hellopage","message",Message);
	}
	
}
