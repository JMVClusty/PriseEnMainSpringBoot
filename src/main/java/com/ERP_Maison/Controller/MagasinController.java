package com.ERP_Maison.Controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ERP_Maison.repositery.MagasinDAO;

@Controller
public class MagasinController {
	
	
	private MagasinDAO magasins;
	
	@Autowired
	public MagasinController(MagasinDAO magasins) {
		super();
		this.magasins = magasins;
	}
	
	
	
	@GetMapping("/Magasin")
	public String statusStock(Model model) {
		
		
		model.addAttribute("magasins", magasins.list());
		
		return "Magasin";
		
	}
	
	
	

}
