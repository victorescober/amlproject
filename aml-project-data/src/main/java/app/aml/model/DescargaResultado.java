package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the descarga_resultados database table.
 * 
 */
@Entity
@Table(name="descarga_resultados")
@NamedQuery(name="DescargaResultado.findAll", query="SELECT d FROM DescargaResultado d")
public class DescargaResultado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_descarga_resultado", unique=true, nullable=false)
	private Integer idDescargaResultado;

	@Column(name="descripcion_resultado_descarga", length=600)
	private String descripcionResultadoDescarga;

	@Column(name="estado_descarga", length=1)
	private String estadoDescarga;

	@Column(name="fecha_registro")
	private Timestamp fechaRegistro;

	@Column(name="ruta_descarga", length=150)
	private String rutaDescarga;

	//bi-directional many-to-one association to DescargaArchivosAml
	@ManyToOne
	@JoinColumn(name="id_descarga_archivo", nullable=false)
	private DescargaArchivosAml descargaArchivosAml;

	public DescargaResultado() {
	}

	public Integer getIdDescargaResultado() {
		return this.idDescargaResultado;
	}

	public void setIdDescargaResultado(Integer idDescargaResultado) {
		this.idDescargaResultado = idDescargaResultado;
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

	public String getRutaDescarga() {
		return this.rutaDescarga;
	}

	public void setRutaDescarga(String rutaDescarga) {
		this.rutaDescarga = rutaDescarga;
	}

	public DescargaArchivosAml getDescargaArchivosAml() {
		return this.descargaArchivosAml;
	}

	public void setDescargaArchivosAml(DescargaArchivosAml descargaArchivosAml) {
		this.descargaArchivosAml = descargaArchivosAml;
	}

}