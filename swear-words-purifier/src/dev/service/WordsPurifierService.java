package dev.service;

import java.util.List;

import dev.dao.WordsPurifierDAO;
import dev.model.Word;

public class WordsPurifierService {

	WordsPurifierDAO wordsPurifierDAO = new WordsPurifierDAO();

	public String transBadWords(String scanText) {
		List<Word> words = wordsPurifierDAO.findAll();
		String transText = scanText;
		for (Word word : words) {
			if (scanText.contains(word.getBadWord())) {
				transText = transText.replaceAll(word.getBadWord(), (word.getKindWord()));
			}
		}
		return transText;
	}

}
