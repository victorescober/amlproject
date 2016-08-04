package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the archivos_aml database table.
 * 
 */
@Entity
@Table(name="archivos_aml")
@NamedQuery(name="ArchivosAml.findAll", query="SELECT a FROM ArchivosAml a")
public class ArchivosAml implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_archivo", unique=true, nullable=false)
	private Integer idArchivo;

	@Column(name="descripcion_archivo", length=150)
	private String descripcionArchivo;

	@Column(name="id_tipo_archivo")
	private Integer idTipoArchivo;

	@Column(name="nombre_archivo", length=20)
	private String nombreArchivo;

	@Column(name="nombre_carpeta", length=20)
	private String nombreCarpeta;

	@Column(length=40)
	private String password;

	@Column(name="url_archivo", length=250)
	private String urlArchivo;

	@Column(length=30)
	private String usuario;

	public ArchivosAml() {
	}

	public Integer getIdArchivo() {
		return this.idArchivo;
	}

	public void setIdArchivo(Integer idArchivo) {
		this.idArchivo = idArchivo;
	}

	public String getDescripcionArchivo() {
		return this.descripcionArchivo;
	}

	public void setDescripcionArchivo(String descripcionArchivo) {
		this.descripcionArchivo = descripcionArchivo;
	}

	public Integer getIdTipoArchivo() {
		return this.idTipoArchivo;
	}

	public void setIdTipoArchivo(Integer idTipoArchivo) {
		this.idTipoArchivo = idTipoArchivo;
	}

	public String getNombreArchivo() {
		return this.nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getNombreCarpeta() {
		return this.nombreCarpeta;
	}

	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrlArchivo() {
		return this.urlArchivo;
	}

	public void setUrlArchivo(String urlArchivo) {
		this.urlArchivo = urlArchivo;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}