package es.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	// add initbinder 
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTimmerEditor);		
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("teacher", new Teacher());
		return "teacher-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("teacher") Teacher theTeacher,
								BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "teacher-form";
		}else {
			if(theTeacher.getNumberStudents() == null) {
				theTeacher.setNumberStudents("0");
			}
			if(theTeacher.getTeacherCode() == null) {
				theTeacher.setTeacherCode("Don't have a code");
			}
			System.out.println(theTeacher.getFirstName() + " = " + theTeacher.getLastName() + " = " + theTeacher.getNumberStudents());
			return "teacher-confirmation";
		}
	}
}
