package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	private long idPerson;
	
	private String name;
	private String firstName;
	private String genre;
	private String profile;
	private String dateNaiss;
	private List<Home> maisons;
	private List<Person> amis;
	private List<ElectronicDevice> ed;

	public Person(String name, String firstName, String genre,
			String profile, String dateNaiss) {
		this.name = name;
		this.firstName = firstName;
		this.genre = genre;
		this.profile = profile;
		this.dateNaiss = dateNaiss;
		maisons = new ArrayList<Home>();
		amis = new ArrayList<Person>();
		ed = new ArrayList<ElectronicDevice>();
	}
 
	@OneToMany(mappedBy = "personne", cascade = CascadeType.PERSIST)
	public List<ElectronicDevice> getEd() {
		return ed;
	}

	public void setEd(List<ElectronicDevice> ed) {
		this.ed = ed;
	}

	@OneToMany
	public List<Person> getAmis() {
		return amis;
	}


	public void setAmis(List<Person> amis) {
		this.amis = amis;
	}

	@OneToMany(mappedBy = "pers", cascade = CascadeType.PERSIST)
	public List<Home> getMaisons() {
		return maisons;
	}


	public void setMaisons(List<Home> maisons) {
		this.maisons = maisons;
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
