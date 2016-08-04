package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the descarga_archivos_aml database table.
 * 
 */
@Entity
@Table(name="descarga_archivos_aml")
@NamedQuery(name="DescargaArchivosAml.findAll", query="SELECT d FROM DescargaArchivosAml d")
public class DescargaArchivosAml implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_descarga_archivo", unique=true, nullable=false)
	private Integer idDescargaArchivo;

	@Column(name="fecha_descarga")
	private Timestamp fechaDescarga;

	@Column(name="fecha_ultima_descarga")
	private Timestamp fechaUltimaDescarga;

	@Column(name="id_archivo")
	private Integer idArchivo;

	private Integer intento;

	@Column(name="intervalo_dias_descarga_archivo")
	private Integer intervaloDiasDescargaArchivo;

	//bi-directional many-to-one association to DescargaResultado
	@OneToMany(mappedBy="descargaArchivosAml")
	private List<DescargaResultado> descargaResultados;

	public DescargaArchivosAml() {
	}

	public Integer getIdDescargaArchivo() {
		return this.idDescargaArchivo;
	}

	public void setIdDescargaArchivo(Integer idDescargaArchivo) {
		this.idDescargaArchivo = idDescargaArchivo;
	}

	public Timestamp getFechaDescarga() {
		return this.fechaDescarga;
	}

	public void setFechaDescarga(Timestamp fechaDescarga) {
		this.fechaDescarga = fechaDescarga;
	}

	public Timestamp getFechaUltimaDescarga() {
		return this.fechaUltimaDescarga;
	}

	public void setFechaUltimaDescarga(Timestamp fechaUltimaDescarga) {
		this.fechaUltimaDescarga = fechaUltimaDescarga;
	}

	public Integer getIdArchivo() {
		return this.idArchivo;
	}

	public void setIdArchivo(Integer idArchivo) {
		this.idArchivo = idArchivo;
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

	public List<DescargaResultado> getDescargaResultados() {
		return this.descargaResultados;
	}

	public void setDescargaResultados(List<DescargaResultado> descargaResultados) {
		this.descargaResultados = descargaResultados;
	}

	public DescargaResultado addDescargaResultado(DescargaResultado descargaResultado) {
		getDescargaResultados().add(descargaResultado);
		descargaResultado.setDescargaArchivosAml(this);

		return descargaResultado;
	}

	public DescargaResultado removeDescargaResultado(DescargaResultado descargaResultado) {
		getDescargaResultados().remove(descargaResultado);
		descargaResultado.setDescargaArchivosAml(null);

		return descargaResultado;
	}

}