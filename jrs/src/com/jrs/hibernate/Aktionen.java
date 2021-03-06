// default package
// Generated Dec 28, 2013 6:02:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Aktionen generated by hbm2java
 */
public class Aktionen implements java.io.Serializable {

	private int id;
	private String name;
	private Boolean gesch�tzt;
	private String text;
	private Date datum;
	private String bearbeiter;
	private Integer art;
	private Boolean gel�scht;
	private Set briefes = new HashSet(0);

	public Aktionen() {
	}

	public Aktionen(int id) {
		this.id = id;
	}

	public Aktionen(int id, String name, Boolean gesch�tzt, String text,
			Date datum, String bearbeiter, Integer art, Boolean gel�scht,
			Set briefes) {
		this.id = id;
		this.name = name;
		this.gesch�tzt = gesch�tzt;
		this.text = text;
		this.datum = datum;
		this.bearbeiter = bearbeiter;
		this.art = art;
		this.gel�scht = gel�scht;
		this.briefes = briefes;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getGesch�tzt() {
		return this.gesch�tzt;
	}

	public void setGesch�tzt(Boolean gesch�tzt) {
		this.gesch�tzt = gesch�tzt;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getBearbeiter() {
		return this.bearbeiter;
	}

	public void setBearbeiter(String bearbeiter) {
		this.bearbeiter = bearbeiter;
	}

	public Integer getArt() {
		return this.art;
	}

	public void setArt(Integer art) {
		this.art = art;
	}

	public Boolean getGel�scht() {
		return this.gel�scht;
	}

	public void setGel�scht(Boolean gel�scht) {
		this.gel�scht = gel�scht;
	}

	public Set getBriefes() {
		return this.briefes;
	}

	public void setBriefes(Set briefes) {
		this.briefes = briefes;
	}

}
