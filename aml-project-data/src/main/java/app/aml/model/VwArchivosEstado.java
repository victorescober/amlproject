package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the vw_archivos_estado database table.
 * 
 */
@Entity
@Table(name="vw_archivos_estado")
@NamedQuery(name="VwArchivosEstado.findAll", query="SELECT v FROM VwArchivosEstado v")
public class VwArchivosEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="descripcion_archivo", length=150)
	private String descripcionArchivo;

	@Column(name="descripcion_resultado_descarga", length=600)
	private String descripcionResultadoDescarga;

	@Column(name="estado_descarga", length=1)
	private String estadoDescarga;

	@Column(name="fecha_registro")
	private Timestamp fechaRegistro;

	@Id
	@Column(name="id_archivo")
	private Integer idArchivo;

	@Column(name="id_descarga_archivo")
	private Integer idDescargaArchivo;

	@Column(name="id_descarga_resultado")
	private Integer idDescargaResultado;

	@Column(name="id_tipo_archivo")
	private Integer idTipoArchivo;

	@Column(name="nombre_archivo", length=20)
	private String nombreArchivo;

	@Column(name="ruta_descarga", length=150)
	private String rutaDescarga;

	public VwArchivosEstado() {
	}

	public String getDescripcionArchivo() {
		return this.descripcionArchivo;
	}

	public void setDescripcionArchivo(String descripcionArchivo) {
		this.descripcionArchivo = descripcionArchivo;
	}

	public String getDescripcionResultadoDescarga() {
		return this.descripcionResultadoDescarga;
	}

	public void setDescripcionResultadoDescarga(String descripcionResultadoDescarga) {
		this.descripcionResultadoDescarga = descripcionResultadoDescarga;
	}

	public String getEstadoDescarga() {
		return this.estadoDescarga;
	}

	public void setEstadoDescarga(String estadoDescarga) {
		this.estadoDescarga = estadoDescarga;
	}

	public Timestamp getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
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

	public Integer getIdDescargaResultado() {
		return this.idDescargaResultado;
	}

	public void setIdDescargaResultado(Integer idDescargaResultado) {
		this.idDescargaResultado = idDescargaResultado;
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

	public String getRutaDescarga() {
		return this.rutaDescarga;
	}

	public void setRutaDescarga(String rutaDescarga) {
		this.rutaDescarga = rutaDescarga;
	}

}