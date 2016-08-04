package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofac_sdn database table.
 * 
 */
@Entity
@Table(name="ofac_sdn")
@NamedQuery(name="OfacSdn.findAll", query="SELECT o FROM OfacSdn o")
public class OfacSdn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ent_num", unique=true, nullable=false)
	private Integer entNum;

	@Column(name="call_sign", length=8)
	private String callSign;

	@Column(length=8)
	private String grt;

	@Column(length=50)
	private String program;

	@Column(length=1000)
	private String remarks;

	@Column(name="sdn_name", length=350)
	private String sdnName;

	@Column(name="sdn_type", length=12)
	private String sdnType;

	@Column(length=200)
	private String title;

	@Column(length=14)
	private String tonnage;

	@Column(name="vess_flag", length=40)
	private String vessFlag;

	@Column(name="vess_owner", length=150)
	private String vessOwner;

	@Column(name="vess_type", length=25)
	private String vessType;

	public OfacSdn() {
	}

	public Integer getEntNum() {
		return this.entNum;
	}

	public void setEntNum(Integer entNum) {
		this.entNum = entNum;
	}

	public String getCallSign() {
		return this.callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public String getGrt() {
		return this.grt;
	}

	public void setGrt(String grt) {
		this.grt = grt;
	}

	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSdnName() {
		return this.sdnName;
	}

	public void setSdnName(String sdnName) {
		this.sdnName = sdnName;
	}

	public String getSdnType() {
		return this.sdnType;
	}

	public void setSdnType(String sdnType) {
		this.sdnType = sdnType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTonnage() {
		return this.tonnage;
	}

	public void setTonnage(String tonnage) {
		this.tonnage = tonnage;
	}

	public String getVessFlag() {
		return this.vessFlag;
	}

	public void setVessFlag(String vessFlag) {
		this.vessFlag = vessFlag;
	}

	public String getVessOwner() {
		return this.vessOwner;
	}

	public void setVessOwner(String vessOwner) {
		this.vessOwner = vessOwner;
	}

	public String getVessType() {
		return this.vessType;
	}

	public void setVessType(String vessType) {
		this.vessType = vessType;
	}

}