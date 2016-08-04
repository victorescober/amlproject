package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the interfaz_parametros database table.
 * 
 */
@Embeddable
public class InterfazParametroPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_interfaz", insertable=false, updatable=false, unique=true, nullable=false)
	private Integer idInterfaz;

	@Column(name="parametro_nombre", unique=true, nullable=false, length=45)
	private String parametroNombre;

	public InterfazParametroPK() {
	}
	public Integer getIdInterfaz() {
		return this.idInterfaz;
	}
	public void setIdInterfaz(Integer idInterfaz) {
		this.idInterfaz = idInterfaz;
	}
	public String getParametroNombre() {
		return this.parametroNombre;
	}
	public void setParametroNombre(String parametroNombre) {
		this.parametroNombre = parametroNombre;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InterfazParametroPK)) {
			return false;
		}
		InterfazParametroPK castOther = (InterfazParametroPK)other;
		return 
			this.idInterfaz.equals(castOther.idInterfaz)
			&& this.parametroNombre.equals(castOther.parametroNombre);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idInterfaz.hashCode();
		hash = hash * prime + this.parametroNombre.hashCode();
		
		return hash;
	}
}