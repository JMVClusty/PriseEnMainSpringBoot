package com.ERP_Maison.Controller.test;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ERP_Maison.Model.Cablage;
import com.ERP_Maison.Model.test.WrapperListBoolean;

@Controller
public class TestController {
	private WrapperListBoolean myBoolean;
	
	@ModelAttribute("boolController")
	public WrapperListBoolean afficheBool() {
		return myBoolean= new WrapperListBoolean();
	}
	
	@ModelAttribute("cablage")
	public Cablage cablage() {
		return  new Cablage(1, "porte","AA","Rennes",4);
	}
	
	
	@GetMapping("/test")
	public String affiche(@RequestParam(required=false)  Boolean uneCheckBox) {		
		if(uneCheckBox!=null) {
			myBoolean.setIsSelected(uneCheckBox);
		}
		myBoolean.setIsSelectedList(new ArrayList<>(List.of(false, false, true)));
		return "test";
	}
	
	@ResponseBody
	@GetMapping("/test/{booleanFromTemplate}")
	public String confirm(@PathVariable Boolean booleanFromTemplate ) {
		return "le boolean qui vient du Model ou Template a comme valeur: "+String.valueOf(booleanFromTemplate);
	}
	
	@ResponseBody
	@GetMapping("/cablage")
	public Cablage uncablage() {
		return new Cablage(1, "porte","AA","Rennes",4);
		}
	
	@GetMapping("/test/bt1Click/{bool}")
	public String changeBooleanByPath(@PathVariable Boolean bool) {
		if (bool==true) {
			myBoolean.setIsSelected(false);
		}else if(bool==false) {
			myBoolean.setIsSelected(true);
		}
		return "test";
	}
	
	@GetMapping("/test/bt1Click")
	public String changeBooleanByParam( @RequestParam(required=false)  Boolean uneCheckBox) {
		if (uneCheckBox==true) {
			myBoolean.setIsSelected(false);
		}else if(uneCheckBox==false) {
			myBoolean.setIsSelected(true);
		}
		return "test";
	}

	@PostMapping("/processCheckbox")
	public String getValeur(@RequestParam (required=false) String checkBox3) {
		System.out.println(checkBox3);
		return "test";
	}
	
}
