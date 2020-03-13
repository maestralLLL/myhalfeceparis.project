package com.myhalf.beans;

public class Profil {
	private String nom;
	private String prenom;
	private String sexe;
	private Integer age;
	private String email;
	private String telephone;
	private String profession;
	private String situation;
	private String adresse;

	public Profil(String nom, String prenom, String sexe, int age, String email, String telephone, String profession,
			String situation, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		this.email = email;
		this.telephone = telephone;
		this.profession = profession;
		this.situation = situation;
		this.adresse = adresse;
	}

	public Profil() {
		this("", "", "", 0, "", "", "", "", "");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
