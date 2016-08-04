package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the interfaz database table.
 * 
 */
@Entity
@Table(name="interfaz")
@NamedQuery(name="Interfaz.findAll", query="SELECT i FROM Interfaz i")
public class Interfaz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_interfaz", unique=true, nullable=false)
	private Integer idInterfaz;

	@Column(name="interfaz_descripcion", length=70)
	private String interfazDescripcion;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;

	//bi-directional many-to-one association to InterfazParametro
	@OneToMany(mappedBy="interfaz")
	private List<InterfazParametro> interfazParametros;

	public Interfaz() {
	}

	public Integer getIdInterfaz() {
		return this.idInterfaz;
	}

	public void setIdInterfaz(Integer idInterfaz) {
		this.idInterfaz = idInterfaz;
	}

	public String getInterfazDescripcion() {
		return this.interfazDescripcion;
	}

	public void setInterfazDescripcion(String interfazDescripcion) {
		this.interfazDescripcion = interfazDescripcion;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<InterfazParametro> getInterfazParametros() {
		return this.interfazParametros;
	}

	public void setInterfazParametros(List<InterfazParametro> interfazParametros) {
		this.interfazParametros = interfazParametros;
	}

	public InterfazParametro addInterfazParametro(InterfazParametro interfazParametro) {
		getInterfazParametros().add(interfazParametro);
		interfazParametro.setInterfaz(this);

		return interfazParametro;
	}

	public InterfazParametro removeInterfazParametro(InterfazParametro interfazParametro) {
		getInterfazParametros().remove(interfazParametro);
		interfazParametro.setInterfaz(null);

		return interfazParametro;
	}

}