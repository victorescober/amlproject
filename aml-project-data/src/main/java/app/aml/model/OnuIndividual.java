package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the onu_individual database table.
 * 
 */
@Entity
@Table(name="onu_individual")
@NamedQuery(name="OnuIndividual.findAll", query="SELECT o FROM OnuIndividual o")
public class OnuIndividual implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer dataid;

	@Column(name="driver_license", length=100)
	private String driverLicense;

	@Column(name="first_name", length=45)
	private String firstName;

	@Column(name="individual_alias_good", length=300)
	private String individualAliasGood;

	@Column(name="individual_alias_low", length=300)
	private String individualAliasLow;

	@Temporal(TemporalType.DATE)
	@Column(name="listed_on")
	private Date listedOn;

	@Column(name="national_identification_number", length=120)
	private String nationalIdentificationNumber;

	@Column(length=60)
	private String nationality;

	@Column(length=200)
	private String passport;

	@Column(name="reference_number", length=30)
	private String referenceNumber;

	@Column(name="second_name", length=45)
	private String secondName;

	@Column(name="un_list_type", length=30)
	private String unListType;

	public OnuIndividual() {
	}

	public Integer getDataid() {
		return this.dataid;
	}

	public void setDataid(Integer dataid) {
		this.dataid = dataid;
	}

	public String getDriverLicense() {
		return this.driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIndividualAliasGood() {
		return this.individualAliasGood;
	}

	public void setIndividualAliasGood(String individualAliasGood) {
		this.individualAliasGood = individualAliasGood;
	}

	public String getIndividualAliasLow() {
		return this.individualAliasLow;
	}

	public void setIndividualAliasLow(String individualAliasLow) {
		this.individualAliasLow = individualAliasLow;
	}

	public Date getListedOn() {
		return this.listedOn;
	}

	public void setListedOn(Date listedOn) {
		this.listedOn = listedOn;
	}

	public String getNationalIdentificationNumber() {
		return this.nationalIdentificationNumber;
	}

	public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
		this.nationalIdentificationNumber = nationalIdentificationNumber;
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

	public String getUnListType() {
		return this.unListType;
	}

	public void setUnListType(String unListType) {
		this.unListType = unListType;
	}

}