package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Home {

	private long idHome;
	private String adresse;
	private String superficie;
	private String IP;
	private Person pers;
	private List<Heater> chauff;


	public Home(String adresse, String superficie, String iP,
			Person pers) {
		this.adresse = adresse;
		this.superficie = superficie;
		IP = iP;
		this.pers = pers;
		chauff = new ArrayList<Heater>();
	}

	@OneToMany(mappedBy = "maison", cascade = CascadeType.PERSIST)
	public List<Heater> getChauff() {
		return chauff;
	}

	public void setChauff(List<Heater> chauff) {
		this.chauff = chauff;
	}
	
	@ManyToOne
	public Person getPers() {
		return pers;
	}

	public void setPers(Person pers) {
		this.pers = pers;
	}

	@Id
    @GeneratedValue
	public long getIdHome() {
		return idHome;
	}

	@Override
	public String toString() {
		return "Home [idHome=" + idHome + ", adresse=" + adresse
				+ ", superficie=" + superficie + ", IP=" + IP + "]";
	}

	public void setIdHome(long idHome) {
		this.idHome = idHome;
	}

	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getSuperficie() {
		return superficie;
	}
	
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	
	public String getIP() {
		return IP;
	}
	
	public void setIP(String iP) {
		IP = iP;
	}


}
