package dev.model;

public class Word {

	private int wordId;
	private String badWord;
	private String kindWord;

	public Word(int wordId, String badWord, String kindWord) {
		super();
		this.wordId = wordId;
		this.badWord = badWord;
		this.kindWord = kindWord;
	}

	@Override
	public String toString() {
		return "Word [wordId=" + wordId + ", badWord=" + badWord + ", kindWord=" + kindWord + "]";
	}

	public int getWordId() {
		return wordId;
	}

	public void setWordId(int wordId) {
		this.wordId = wordId;
	}

	public String getBadWord() {
		return badWord;
	}

	public void setBadWord(String badWord) {
		this.badWord = badWord;
	}

	public String getKindWord() {
		return kindWord;
	}

	public void setKindWord(String kindWord) {
		this.kindWord = kindWord;
	}

}
