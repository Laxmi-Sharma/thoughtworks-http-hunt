package com.thoughtworks.hunt.game;

import org.springframework.stereotype.Service;

@Service
public class CharCountService {

	public Integer countCharacters(String input) {
		char[] characters = input.toCharArray();
		int count = 0;
		if (input != null)
			count = characters.length;
		return count;
	}
}
