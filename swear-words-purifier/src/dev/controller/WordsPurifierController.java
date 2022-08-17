package dev.controller;

import dev.scanner.WordsPurifierScanner;
import dev.service.WordsPurifierService;
import dev.view.WordsPurifierView;

public class WordsPurifierController {

	private String inputText;
	private WordsPurifierService wordsPurifierService = new WordsPurifierService();
	private WordsPurifierView wordsPurifierView = new WordsPurifierView();

	public void startProgram() {
		wordsPurifierView.viewMain();

		WordsPurifierScanner wordsPurifierScanner = new WordsPurifierScanner();

		inputText = wordsPurifierService.transBadWords(wordsPurifierScanner.scanText());

		wordsPurifierView.printKindWords(inputText);
	}

}
