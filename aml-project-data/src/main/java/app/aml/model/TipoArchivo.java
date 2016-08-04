package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_archivo database table.
 * 
 */
@Entity
@Table(name="tipo_archivo")
@NamedQuery(name="TipoArchivo.findAll", query="SELECT t FROM TipoArchivo t")
public class TipoArchivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_archivo", unique=true, nullable=false)
	private Integer idTipoArchivo;

	@Column(name="descripcion_tipo", nullable=false, length=60)
	private String descripcionTipo;

	@Column(name="pass_ftp", length=60)
	private String passFtp;

	@Column(name="tipo_conexion")
	private Integer tipoConexion;

	@Column(name="user_ftp", length=35)
	private String userFtp;

	public TipoArchivo() {
	}

	public Integer getIdTipoArchivo() {
		return this.idTipoArchivo;
	}

	public void setIdTipoArchivo(Integer idTipoArchivo) {
		this.idTipoArchivo = idTipoArchivo;
	}

	public String getDescripcionTipo() {
		return this.descripcionTipo;
	}

	public void setDescripcionTipo(String descripcionTipo) {
		this.descripcionTipo = descripcionTipo;
	}

	public String getPassFtp() {
		return this.passFtp;
	}

	public void setPassFtp(String passFtp) {
		this.passFtp = passFtp;
	}

	public Integer getTipoConexion() {
		return this.tipoConexion;
	}

	public void setTipoConexion(Integer tipoConexion) {
		this.tipoConexion = tipoConexion;
	}

	public String getUserFtp() {
		return this.userFtp;
	}

	public void setUserFtp(String userFtp) {
		this.userFtp = userFtp;
	}

}