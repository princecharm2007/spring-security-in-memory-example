package br.com.alexandre.spring_security_in_memory_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController {

	@RequestMapping(value="/principal.html", method=RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("principal");
	}
}
