package es.openwebiners.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("saludo", "Hola Mundo");
		model.addAttribute("mensaje", "Saludos desde proyecto Spring con Maven");
		model.addAttribute("url", "www.google.es");
		
		return "hello";
	}
}
