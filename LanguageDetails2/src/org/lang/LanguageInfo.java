package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("TamilLanguage : 30%");

	}
	private void englishLanguage() {
		System.out.println("EnglishLanguage : 50%");
	}
	private void hindiLanguage() {
		System.out.println("HindiLanguage : 20%");

	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		l.sothIndia();
		l.northIndia();
		
	}

}
