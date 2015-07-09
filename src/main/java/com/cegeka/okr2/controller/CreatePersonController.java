package com.cegeka.okr2.controller;

import com.cegeka.okr2.model.Person;
import com.cegeka.okr2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreatePersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "createperson", method = RequestMethod.GET)
    public String createPersonForm(Model model){
        model.addAttribute("person", new Person());
        return "createPerson";
    }

    @RequestMapping(value = "createperson", method = RequestMethod.POST)
    public String createPersonSubmit(@ModelAttribute Person person, Model model){
        Person newPerson = personRepository.save(person);
        model.addAttribute("succeeded", true);
        model.addAttribute("newPerson", newPerson.toString());
        model.addAttribute("person", new Person());
        return "createPerson";
    }
}
