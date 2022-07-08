package com.ERP_Maison.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MenuController {

	@GetMapping("/menu")
	public String showMenu() {
		//		model.addAttribute("user", user);

			return "menu";
		}
	

}
