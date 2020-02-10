package com.thoughtworks.hunt.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/challenge")
public class ThoughtworksHttpHuntGameApplication {

	@Autowired
	CharCountService charCountService;

	public static void main(String[] args) {
		SpringApplication.run(ThoughtworksHttpHuntGameApplication.class, args);
	}

	@RequestMapping(value = "/output", method = RequestMethod.POST, consumes = "application/json")
	public OutputResource getCharacterCounts(@RequestBody InputResource input) {
		OutputResource outputResource = new OutputResource();
		Integer count = charCountService.countCharacters(input.getInput().getText());
		Output output = new Output();
		output.setCount(count);
		outputResource.setOutput(output);
		return outputResource;
	}
}
