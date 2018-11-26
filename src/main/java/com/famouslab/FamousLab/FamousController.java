package com.famouslab.FamousLab;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.famouslab.FamousLab.entity.HallOfFame;
import com.famouslab.FamousLab.entity.TinyHero;


//some comments reference swapi which is the demo that was used to create this project
@Controller
public class FamousController {

	@RequestMapping("/")
	public ModelAndView tinyList() {

		// Create the RestTemplate
		RestTemplate rt = new RestTemplate();

		// Set up the headers
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing!"); // Typically the documentation will tell you what to add here
		// swapi doesn't specify so we can add any value and it will work

		ResponseEntity<HallOfFame> pr = rt.exchange("https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json",
				HttpMethod.GET, new HttpEntity<>(headers), HallOfFame.class);
		

//		System.out.println(pr.getBody()); // returns all of the data as a getBody object???
		// this is one way to get access to the list
		
		
		return new ModelAndView("index", "tinylist2", pr.getBody().getTiny());
	}
				
		@RequestMapping("completelist")
		public ModelAndView completeList() {

			// Create the RestTemplate
			RestTemplate rt = new RestTemplate();

			// Set up the headers
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.USER_AGENT, "Testing!"); // Typically the documentation will tell you what to add here
			// swapi doesn't specify so we can add any value and it will work

			ResponseEntity<HallOfFame> pr2 = rt.exchange("https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json",
					HttpMethod.GET, new HttpEntity<>(headers), HallOfFame.class);
			
	

		return new ModelAndView("completelist", "completelist", pr2.getBody().getComplete());
		
		
//		return new ModelAndView("character-list", "people", pr.getBody()); 
		// this is another option if you use ${people.results) on the character-list page

	}

}
