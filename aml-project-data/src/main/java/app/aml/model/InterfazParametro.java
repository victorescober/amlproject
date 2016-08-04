package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the interfaz_parametros database table.
 * 
 */
@Entity
@Table(name="interfaz_parametros")
@NamedQuery(name="InterfazParametro.findAll", query="SELECT i FROM InterfazParametro i")
public class InterfazParametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InterfazParametroPK id;

	@Column(name="parametro_valor", length=350)
	private String parametroValor;

	//bi-directional many-to-one association to Interfaz
	@ManyToOne
	@JoinColumn(name="id_interfaz", nullable=false, insertable=false, updatable=false)
	private Interfaz interfaz;

	public InterfazParametro() {
	}

	public InterfazParametroPK getId() {
		return this.id;
	}

	public void setId(InterfazParametroPK id) {
		this.id = id;
	}

	public String getParametroValor() {
		return this.parametroValor;
	}

	public void setParametroValor(String parametroValor) {
		this.parametroValor = parametroValor;
	}

	public Interfaz getInterfaz() {
		return this.interfaz;
	}

	public void setInterfaz(Interfaz interfaz) {
		this.interfaz = interfaz;
	}

}