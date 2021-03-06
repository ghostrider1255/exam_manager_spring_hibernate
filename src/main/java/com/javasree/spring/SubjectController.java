package com.javasree.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javasree.spring.model.Person;
import com.javasree.spring.model.Subject;
import com.javasree.spring.service.PersonService;
import com.javasree.spring.service.SubjectService;

@Controller
public class SubjectController {

	
	private SubjectService subjectService;
	
	@Autowired(required=true)
	@Qualifier(value="subjectService")
	public void setSubjectService(SubjectService subjectService)
	{
		this.subjectService = subjectService;
	}
	
	@RequestMapping(value="/subjects", method = RequestMethod.GET)
	public String listSubjects(Model model)
	{
		model.addAttribute("subject",new Subject());
		model.addAttribute("listSubjects", this.subjectService.listSubjects());
		return "subjects";
	}
	
	//For add and update subject both
	@RequestMapping(value= "/subject/add", method = RequestMethod.POST)
	public String addSubject(@ModelAttribute("subject") Subject subject){
			
		if(subject.getSubjectId() == 0){
			//new Subject, add it
			this.subjectService.addSubject(subject);
		}else{
			//existing subject, call update
			this.subjectService.updateSubject(subject);
		}
			
		return "redirect:/subjects";
			
	}
		
		@RequestMapping("/removeSubject/{subjectId}")
	    public String removeSubject(@PathVariable("subjectId") long subjectId){
			
	        this.subjectService.removeSubject(subjectId);
	        return "redirect:/subjects";
	    }
	 
	    @RequestMapping("/editSubject/{subjectId}")
	    public String editSubject(@PathVariable("subjectId") long subjectId, Model model){
	        model.addAttribute("subject", this.subjectService.getSubjectById(subjectId));
	        model.addAttribute("listSubjects", this.subjectService.listSubjects());
	        return "subjects";
	    }
}
