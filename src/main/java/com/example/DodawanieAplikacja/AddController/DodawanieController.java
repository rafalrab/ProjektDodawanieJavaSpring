package com.example.DodawanieAplikacja.AddController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DodawanieAplikacja.domain.dodawanie;

@Controller
public class DodawanieController {

	@GetMapping("/DodawanieAplikacja/src/main/resources/templates/index.html")
	public String sendForm(Model model)
	{
		model.addAttribute("Dodawanie", new dodawanie());
		return "/DodawanieAplikacja/src/main/resources/templates/index.html";
		
	}
	@PostMapping("/DodawanieAplikacja/src/main/resources/templates/oblicz.html")
	public String addForm(@ModelAttribute dodawanie dodawanie,BindingResult result,Model model)
	{
		model.addAttribute("dodawanie",dodawanie);
		return "/DodawanieAplikacja/src/main/resources/templates/oblicz.html";
	}
}
