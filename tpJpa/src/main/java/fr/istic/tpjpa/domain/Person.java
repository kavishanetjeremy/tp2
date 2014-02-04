package fr.istic.tpjpa.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Person {

	private long idPerson;
	
	private String name;
	private String firstName;
	private String genre;
	private String profile;
	private String dateNaiss;
	private Home home;
	

	public Person(String name, String firstName, String genre,
			String profile, String dateNaiss, Home home) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.genre = genre;
		this.profile = profile;
		this.dateNaiss = dateNaiss;
		this.home = home;
	}

	@ManyToOne
	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	@Id
    @GeneratedValue
	public long getIdPerson() {
		return idPerson;
	}

	@Override
	public String toString() {
		return "Person [idPerson=" + idPerson + ", name=" + name
				+ ", firstName=" + firstName + ", genre=" + genre
				+ ", profile=" + profile + ", dateNaiss=" + dateNaiss + "]";
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getDateNaiss() {
		return dateNaiss;
	}


	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}


	
}
