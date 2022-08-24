package palvelinohjelmointi.viikkoharjoitus1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HarjoitusController {
	
	@RequestMapping("index")
	@ResponseBody
	public String showIndex() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String showWelcome(@RequestParam(name="paikka", required=false, defaultValue="world") String paikka, 
			@RequestParam(name="nimi", required=false, defaultValue="stranger") String nimi) {
		return "Welcome to the " + paikka + " " + nimi;
	}

}
