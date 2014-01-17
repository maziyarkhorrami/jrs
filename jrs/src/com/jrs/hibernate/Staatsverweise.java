// default package
// Generated Dec 28, 2013 6:02:01 PM by Hibernate Tools 3.4.0.CR1

/**
 * Staatsverweise generated by hbm2java
 */
public class Staatsverweise implements java.io.Serializable {

	private int id;
	private Adressen adressen;
	private Integer eigenschaftId;

	public Staatsverweise() {
	}

	public Staatsverweise(int id) {
		this.id = id;
	}

	public Staatsverweise(int id, Adressen adressen, Integer eigenschaftId) {
		this.id = id;
		this.adressen = adressen;
		this.eigenschaftId = eigenschaftId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adressen getAdressen() {
		return this.adressen;
	}

	public void setAdressen(Adressen adressen) {
		this.adressen = adressen;
	}

	public Integer getEigenschaftId() {
		return this.eigenschaftId;
	}

	public void setEigenschaftId(Integer eigenschaftId) {
		this.eigenschaftId = eigenschaftId;
	}

}
