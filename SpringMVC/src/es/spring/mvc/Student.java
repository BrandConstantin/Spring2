package es.spring.mvc;

import java.util.LinkedHashMap;

public class Student {
	public String firstName;
	public String lastName;
	public String country;
	private LinkedHashMap<String, String> erasmusCountry;
	public String favoriteLanguage;
	private String[] favoriteIde;
	
	public Student() {
		// populate range birth options
		erasmusCountry = new LinkedHashMap<>();
		erasmusCountry.put("SW", "Switzerland");
		erasmusCountry.put("HL", "Holland");
		erasmusCountry.put("DK", "Dinamark");
		erasmusCountry.put("DSC", "Deutschland");
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getErasmusCountry() {
		return erasmusCountry;
	}

//	public void setErasmusCountry(LinkedHashMap<String, String> erasmusCountry) {
//		this.erasmusCountry = erasmusCountry;
//	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getFavoriteIde() {
		return favoriteIde;
	}

	public void setFavoriteIde(String[] favoriteIde) {
		this.favoriteIde = favoriteIde;
	}
	
}
