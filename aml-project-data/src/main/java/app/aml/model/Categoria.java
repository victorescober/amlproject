package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@Table(name="categoria")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_categoria", unique=true, nullable=false)
	private Integer idCategoria;

	@Column(name="descripcion_categoria", length=60)
	private String descripcionCategoria;

	//bi-directional many-to-one association to Interfaz
	@OneToMany(mappedBy="categoria")
	private List<Interfaz> interfazs;

	public Categoria() {
	}

	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcionCategoria() {
		return this.descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}

	public List<Interfaz> getInterfazs() {
		return this.interfazs;
	}

	public void setInterfazs(List<Interfaz> interfazs) {
		this.interfazs = interfazs;
	}

	public Interfaz addInterfaz(Interfaz interfaz) {
		getInterfazs().add(interfaz);
		interfaz.setCategoria(this);

		return interfaz;
	}

	public Interfaz removeInterfaz(Interfaz interfaz) {
		getInterfazs().remove(interfaz);
		interfaz.setCategoria(null);

		return interfaz;
	}

}