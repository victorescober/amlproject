package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the onu_list database table.
 * 
 */
@Entity
@Table(name="onu_list")
@NamedQuery(name="OnuList.findAll", query="SELECT o FROM OnuList o")
public class OnuList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="alias_name_good", length=500)
	private String aliasNameGood;

	@Column(name="alias_name_low", length=450)
	private String aliasNameLow;
	
	@Id
	@Column(name="data_id", length=30)
	private String dataId;

	@Column(name="driver_license", length=50)
	private String driverLicense;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	@Column(name="first_name", length=130)
	private String firstName;

	@Column(name="listed_on", length=45)
	private String listedOn;

	@Column(name="national_id", length=250)
	private String nationalId;

	@Column(length=45)
	private String nationality;

	@Column(length=350)
	private String passport;

	@Column(name="reference_number", length=45)
	private String referenceNumber;

	@Column(name="second_name", length=80)
	private String secondName;

	@Column(name="tipo_persona")
	private Integer tipoPersona;

	@Column(name="un_list_type", length=50)
	private String unListType;

	public OnuList() {
	}

	public String getAliasNameGood() {
		return this.aliasNameGood;
	}

	public void setAliasNameGood(String aliasNameGood) {
		this.aliasNameGood = aliasNameGood;
	}

	public String getAliasNameLow() {
		return this.aliasNameLow;
	}

	public void setAliasNameLow(String aliasNameLow) {
		this.aliasNameLow = aliasNameLow;
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDriverLicense() {
		return this.driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getListedOn() {
		return this.listedOn;
	}

	public void setListedOn(String listedOn) {
		this.listedOn = listedOn;
	}

	public String getNationalId() {
		return this.nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassport() {
		return this.passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Integer getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(Integer tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getUnListType() {
		return this.unListType;
	}

	public void setUnListType(String unListType) {
		this.unListType = unListType;
	}

}