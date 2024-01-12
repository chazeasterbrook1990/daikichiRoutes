package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String Daikichi() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String Today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String Tomorrow() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{destination}")
	public String Travel(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to "+ destination + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String Lotto(@PathVariable("number") Integer number) {
		if(number%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else if((number%2)>0) {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		else {
			return "Please enter a number.";
		}
	}
}
