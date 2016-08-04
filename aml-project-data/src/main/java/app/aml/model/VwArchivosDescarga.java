package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the vw_archivos_descarga database table.
 * 
 */
@Entity
@Table(name="vw_archivos_descarga")
@NamedQuery(name="VwArchivosDescarga.findAll", query="SELECT v FROM VwArchivosDescarga v")
public class VwArchivosDescarga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="fecha_descarga")
	private Timestamp fechaDescarga;
	
	@Id
	@Column(name="id_archivo")
	private Integer idArchivo;

	@Column(name="id_descarga_archivo")
	private Integer idDescargaArchivo;

	@Column(name="id_tipo_archivo")
	private Integer idTipoArchivo;

	private Integer intento;

	@Column(name="intervalo_dias_descarga_archivo")
	private Integer intervaloDiasDescargaArchivo;

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

	public VwArchivosDescarga() {
	}

	public Timestamp getFechaDescarga() {
		return this.fechaDescarga;
	}

	public void setFechaDescarga(Timestamp fechaDescarga) {
		this.fechaDescarga = fechaDescarga;
	}

	public Integer getIdArchivo() {
		return this.idArchivo;
	}

	public void setIdArchivo(Integer idArchivo) {
		this.idArchivo = idArchivo;
	}

	public Integer getIdDescargaArchivo() {
		return this.idDescargaArchivo;
	}

	public void setIdDescargaArchivo(Integer idDescargaArchivo) {
		this.idDescargaArchivo = idDescargaArchivo;
	}

	public Integer getIdTipoArchivo() {
		return this.idTipoArchivo;
	}

	public void setIdTipoArchivo(Integer idTipoArchivo) {
		this.idTipoArchivo = idTipoArchivo;
	}

	public Integer getIntento() {
		return this.intento;
	}

	public void setIntento(Integer intento) {
		this.intento = intento;
	}

	public Integer getIntervaloDiasDescargaArchivo() {
		return this.intervaloDiasDescargaArchivo;
	}

	public void setIntervaloDiasDescargaArchivo(Integer intervaloDiasDescargaArchivo) {
		this.intervaloDiasDescargaArchivo = intervaloDiasDescargaArchivo;
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