// default package
// Generated Dec 28, 2013 6:02:01 PM by Hibernate Tools 3.4.0.CR1

/**
 * ExportvorschriftenId generated by hbm2java
 */
public class ExportvorschriftenId implements java.io.Serializable {

	private Integer id;
	private String exportName;
	private Integer anschrift;
	private Integer sonstiges;
	private Integer rest;
	private String sortierung;
	private Short exportformat;
	private String fileName;
	private String tabellenName;
	private Boolean ersterDatensatz;

	public ExportvorschriftenId() {
	}

	public ExportvorschriftenId(Integer id, String exportName,
			Integer anschrift, Integer sonstiges, Integer rest,
			String sortierung, Short exportformat, String fileName,
			String tabellenName, Boolean ersterDatensatz) {
		this.id = id;
		this.exportName = exportName;
		this.anschrift = anschrift;
		this.sonstiges = sonstiges;
		this.rest = rest;
		this.sortierung = sortierung;
		this.exportformat = exportformat;
		this.fileName = fileName;
		this.tabellenName = tabellenName;
		this.ersterDatensatz = ersterDatensatz;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExportName() {
		return this.exportName;
	}

	public void setExportName(String exportName) {
		this.exportName = exportName;
	}

	public Integer getAnschrift() {
		return this.anschrift;
	}

	public void setAnschrift(Integer anschrift) {
		this.anschrift = anschrift;
	}

	public Integer getSonstiges() {
		return this.sonstiges;
	}

	public void setSonstiges(Integer sonstiges) {
		this.sonstiges = sonstiges;
	}

	public Integer getRest() {
		return this.rest;
	}

	public void setRest(Integer rest) {
		this.rest = rest;
	}

	public String getSortierung() {
		return this.sortierung;
	}

	public void setSortierung(String sortierung) {
		this.sortierung = sortierung;
	}

	public Short getExportformat() {
		return this.exportformat;
	}

	public void setExportformat(Short exportformat) {
		this.exportformat = exportformat;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTabellenName() {
		return this.tabellenName;
	}

	public void setTabellenName(String tabellenName) {
		this.tabellenName = tabellenName;
	}

	public Boolean getErsterDatensatz() {
		return this.ersterDatensatz;
	}

	public void setErsterDatensatz(Boolean ersterDatensatz) {
		this.ersterDatensatz = ersterDatensatz;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExportvorschriftenId))
			return false;
		ExportvorschriftenId castOther = (ExportvorschriftenId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getExportName() == castOther.getExportName()) || (this
						.getExportName() != null
						&& castOther.getExportName() != null && this
						.getExportName().equals(castOther.getExportName())))
				&& ((this.getAnschrift() == castOther.getAnschrift()) || (this
						.getAnschrift() != null
						&& castOther.getAnschrift() != null && this
						.getAnschrift().equals(castOther.getAnschrift())))
				&& ((this.getSonstiges() == castOther.getSonstiges()) || (this
						.getSonstiges() != null
						&& castOther.getSonstiges() != null && this
						.getSonstiges().equals(castOther.getSonstiges())))
				&& ((this.getRest() == castOther.getRest()) || (this.getRest() != null
						&& castOther.getRest() != null && this.getRest()
						.equals(castOther.getRest())))
				&& ((this.getSortierung() == castOther.getSortierung()) || (this
						.getSortierung() != null
						&& castOther.getSortierung() != null && this
						.getSortierung().equals(castOther.getSortierung())))
				&& ((this.getExportformat() == castOther.getExportformat()) || (this
						.getExportformat() != null
						&& castOther.getExportformat() != null && this
						.getExportformat().equals(castOther.getExportformat())))
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getTabellenName() == castOther.getTabellenName()) || (this
						.getTabellenName() != null
						&& castOther.getTabellenName() != null && this
						.getTabellenName().equals(castOther.getTabellenName())))
				&& ((this.getErsterDatensatz() == castOther
						.getErsterDatensatz()) || (this.getErsterDatensatz() != null
						&& castOther.getErsterDatensatz() != null && this
						.getErsterDatensatz().equals(
								castOther.getErsterDatensatz())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getExportName() == null ? 0 : this.getExportName()
						.hashCode());
		result = 37 * result
				+ (getAnschrift() == null ? 0 : this.getAnschrift().hashCode());
		result = 37 * result
				+ (getSonstiges() == null ? 0 : this.getSonstiges().hashCode());
		result = 37 * result
				+ (getRest() == null ? 0 : this.getRest().hashCode());
		result = 37
				* result
				+ (getSortierung() == null ? 0 : this.getSortierung()
						.hashCode());
		result = 37
				* result
				+ (getExportformat() == null ? 0 : this.getExportformat()
						.hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37
				* result
				+ (getTabellenName() == null ? 0 : this.getTabellenName()
						.hashCode());
		result = 37
				* result
				+ (getErsterDatensatz() == null ? 0 : this.getErsterDatensatz()
						.hashCode());
		return result;
	}

}
