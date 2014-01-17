// default package
// Generated Dec 28, 2013 6:02:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Gebühren generated by hbm2java
 */
public class Gebühren implements java.io.Serializable {

	private int id;
	private Kategorien kategorien;
	private Kurse kurse;
	private Zahlungsarten zahlungsarten;
	private Schülerinformationen schülerinformationen;
	private Double gebühr;
	private Float rabatt;
	private Date von;
	private Date bis;
	private Integer unterrichtId;
	private Double bezahlt;
	private Boolean fällig;
	private String rabatte;
	private Double realGebühr;
	private Boolean einzelGebühr;
	private String bezeichnung;
	private Integer rechnung;
	private String datum;
	private String auszug;
	private Integer ermässigt;

	public Gebühren() {
	}

	public Gebühren(int id) {
		this.id = id;
	}

	public Gebühren(int id, Kategorien kategorien, Kurse kurse,
			Zahlungsarten zahlungsarten,
			Schülerinformationen schülerinformationen, Double gebühr,
			Float rabatt, Date von, Date bis, Integer unterrichtId,
			Double bezahlt, Boolean fällig, String rabatte, Double realGebühr,
			Boolean einzelGebühr, String bezeichnung, Integer rechnung,
			String datum, String auszug, Integer ermässigt) {
		this.id = id;
		this.kategorien = kategorien;
		this.kurse = kurse;
		this.zahlungsarten = zahlungsarten;
		this.schülerinformationen = schülerinformationen;
		this.gebühr = gebühr;
		this.rabatt = rabatt;
		this.von = von;
		this.bis = bis;
		this.unterrichtId = unterrichtId;
		this.bezahlt = bezahlt;
		this.fällig = fällig;
		this.rabatte = rabatte;
		this.realGebühr = realGebühr;
		this.einzelGebühr = einzelGebühr;
		this.bezeichnung = bezeichnung;
		this.rechnung = rechnung;
		this.datum = datum;
		this.auszug = auszug;
		this.ermässigt = ermässigt;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Kategorien getKategorien() {
		return this.kategorien;
	}

	public void setKategorien(Kategorien kategorien) {
		this.kategorien = kategorien;
	}

	public Kurse getKurse() {
		return this.kurse;
	}

	public void setKurse(Kurse kurse) {
		this.kurse = kurse;
	}

	public Zahlungsarten getZahlungsarten() {
		return this.zahlungsarten;
	}

	public void setZahlungsarten(Zahlungsarten zahlungsarten) {
		this.zahlungsarten = zahlungsarten;
	}

	public Schülerinformationen getSchülerinformationen() {
		return this.schülerinformationen;
	}

	public void setSchülerinformationen(
			Schülerinformationen schülerinformationen) {
		this.schülerinformationen = schülerinformationen;
	}

	public Double getGebühr() {
		return this.gebühr;
	}

	public void setGebühr(Double gebühr) {
		this.gebühr = gebühr;
	}

	public Float getRabatt() {
		return this.rabatt;
	}

	public void setRabatt(Float rabatt) {
		this.rabatt = rabatt;
	}

	public Date getVon() {
		return this.von;
	}

	public void setVon(Date von) {
		this.von = von;
	}

	public Date getBis() {
		return this.bis;
	}

	public void setBis(Date bis) {
		this.bis = bis;
	}

	public Integer getUnterrichtId() {
		return this.unterrichtId;
	}

	public void setUnterrichtId(Integer unterrichtId) {
		this.unterrichtId = unterrichtId;
	}

	public Double getBezahlt() {
		return this.bezahlt;
	}

	public void setBezahlt(Double bezahlt) {
		this.bezahlt = bezahlt;
	}

	public Boolean getFällig() {
		return this.fällig;
	}

	public void setFällig(Boolean fällig) {
		this.fällig = fällig;
	}

	public String getRabatte() {
		return this.rabatte;
	}

	public void setRabatte(String rabatte) {
		this.rabatte = rabatte;
	}

	public Double getRealGebühr() {
		return this.realGebühr;
	}

	public void setRealGebühr(Double realGebühr) {
		this.realGebühr = realGebühr;
	}

	public Boolean getEinzelGebühr() {
		return this.einzelGebühr;
	}

	public void setEinzelGebühr(Boolean einzelGebühr) {
		this.einzelGebühr = einzelGebühr;
	}

	public String getBezeichnung() {
		return this.bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public Integer getRechnung() {
		return this.rechnung;
	}

	public void setRechnung(Integer rechnung) {
		this.rechnung = rechnung;
	}

	public String getDatum() {
		return this.datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getAuszug() {
		return this.auszug;
	}

	public void setAuszug(String auszug) {
		this.auszug = auszug;
	}

	public Integer getErmässigt() {
		return this.ermässigt;
	}

	public void setErmässigt(Integer ermässigt) {
		this.ermässigt = ermässigt;
	}

}
