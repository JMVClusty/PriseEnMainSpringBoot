package com.ERP_Maison.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ERP_Maison.Model.Salarie;
import com.ERP_Maison.repositery.UserDAO;

@Controller
public class LoginController {
//	
	

	
	private UserDAO salarie;
	
	@Autowired
	public LoginController(JdbcTemplate jdbcTemplate, UserDAO salarie) {
		super();
		
		this.salarie = salarie;
	}

	@GetMapping("/Login")
	public String showForm(@ModelAttribute("user") Salarie user) {
	//		model.addAttribute("user", user);
		
		
		return "Login";
	}
	
	@PostMapping("/Login")
 String submitForm(@ModelAttribute Salarie user, Model model){
		System.out.println(user);
		String resultatLog="";

//		Connection à la base de donnée
//			Requete SQL SELECT nom, Password FROM Salarié
			

		if (salarie.authentifier(user.getNom_Salarie(), user.getPrenom_Salarie(),user.getPassword() ).isPresent()){
			System.out.println(resultatLog);
			resultatLog= "redirect:/menu";
		}else {
			
			resultatLog="redirect:/Login";
		}
		return resultatLog;
		
	}
	
			
	

}
