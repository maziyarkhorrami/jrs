// default package
// Generated Dec 28, 2013 6:02:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Adressendruck generated by hbm2java
 */
public class Adressendruck implements java.io.Serializable {

	private int id;
	private String vorname;
	private String nachname;
	private String gruppe;
	private String anrede;
	private String stra�e;
	private String plz;
	private String ort;
	private String land;
	private Date geburtsdatum;
	private String tel1;
	private String tel2;
	private String tel3;
	private String fax;
	private String funk;
	private String email;
	private String instrument;

	public Adressendruck() {
	}

	public Adressendruck(int id) {
		this.id = id;
	}

	public Adressendruck(int id, String vorname, String nachname,
			String gruppe, String anrede, String stra�e, String plz,
			String ort, String land, Date geburtsdatum, String tel1,
			String tel2, String tel3, String fax, String funk, String email,
			String instrument) {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.gruppe = gruppe;
		this.anrede = anrede;
		this.stra�e = stra�e;
		this.plz = plz;
		this.ort = ort;
		this.land = land;
		this.geburtsdatum = geburtsdatum;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.fax = fax;
		this.funk = funk;
		this.email = email;
		this.instrument = instrument;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getGruppe() {
		return this.gruppe;
	}

	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	}

	public String getAnrede() {
		return this.anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getStra�e() {
		return this.stra�e;
	}

	public void setStra�e(String stra�e) {
		this.stra�e = stra�e;
	}

	public String getPlz() {
		return this.plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return this.ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getLand() {
		return this.land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public Date getGeburtsdatum() {
		return this.geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getTel1() {
		return this.tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return this.tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return this.tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFunk() {
		return this.funk;
	}

	public void setFunk(String funk) {
		this.funk = funk;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstrument() {
		return this.instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

}