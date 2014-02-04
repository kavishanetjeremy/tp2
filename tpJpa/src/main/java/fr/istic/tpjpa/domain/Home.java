package fr.istic.tpjpa.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Home {

	private long idHome;
	private String adresse;
	private String superficie;
	private String IP;

	public Home(String adresse, String superficie, String iP) {
		super();
		this.adresse = adresse;
		this.superficie = superficie;
		IP = iP;
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
