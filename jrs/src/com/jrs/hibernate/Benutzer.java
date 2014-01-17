package com.jrs.hibernate;

// default package
// Generated Dec 28, 2013 6:02:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Benutzer generated by hbm2java
 */
@Entity
@Table(name = "benutzer" , catalog = "jrsdbmysql" )
public class Benutzer implements java.io.Serializable {

	private String benutzername;
	private String kennwort;
	private String stellung;
	private String vorname;
	private String nachname;
	private Date geburtsdatum;
	private Boolean enabled;
	private Boolean admin;

	public Benutzer() {
	}

	public Benutzer(String benutzername, String kennwort, String stellung) {
		this.benutzername = benutzername;
		this.kennwort = kennwort;
		this.stellung = stellung;
	}

	public Benutzer(String benutzername, String kennwort) {
		this.benutzername = benutzername;
		this.kennwort = kennwort;
	
	}
	public Benutzer(String benutzername, String kennwort, String stellung,
			String vorname, String nachname, Date geburtsdatum,
			Boolean enabled, Boolean admin) {
		this.benutzername = benutzername;
		this.kennwort = kennwort;
		this.stellung = stellung;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.enabled = enabled;
		this.admin = admin;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "benutzername", unique = true, nullable = false)
	public String getBenutzername() {
		return this.benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	@Column(name = "kennwort", nullable = false)
	public String getKennwort() {
		return this.kennwort;
	}

	public void setKennwort(String kennwort) {
		this.kennwort = kennwort;
	}
	@Column(name = "stellung", nullable = false)
	public String getStellung() {
		return this.stellung;
	}

	public void setStellung(String stellung) {
		this.stellung = stellung;
	}
	@Column(name = "vorname")
	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	@Column(name = "nachname")
	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@Column(name = "geburtsdatum")
	public Date getGeburtsdatum() {
		return this.geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	@Column(name = "enabled")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	@Column(name = "admin")
	public Boolean getAdmin() {
		return this.admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

}