// default package
// Generated Dec 28, 2013 6:02:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * THonorarabrechnungen generated by hbm2java
 */
public class THonorarabrechnungen implements java.io.Serializable {

	private int id;
	private Integer lehrer;
	private Date zeitraum;

	public THonorarabrechnungen() {
	}

	public THonorarabrechnungen(int id) {
		this.id = id;
	}

	public THonorarabrechnungen(int id, Integer lehrer, Date zeitraum) {
		this.id = id;
		this.lehrer = lehrer;
		this.zeitraum = zeitraum;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getLehrer() {
		return this.lehrer;
	}

	public void setLehrer(Integer lehrer) {
		this.lehrer = lehrer;
	}

	public Date getZeitraum() {
		return this.zeitraum;
	}

	public void setZeitraum(Date zeitraum) {
		this.zeitraum = zeitraum;
	}

}
