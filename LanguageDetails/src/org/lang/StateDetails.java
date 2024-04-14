package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("SouthIndia : 50%");

	}
		private void northIndia() {
			System.out.println("NorthIndia : 50%");
		}
		public static void main(String[] args) {
			StateDetails s = new StateDetails();
			
			s.southIndia();
			s.northIndia();
			
			LanguageInfo info = new LanguageInfo();
			info.tamilLanguage();
			info.englishLanguage();
			info.hindiLanguage();
			
		
			
		}
	}


