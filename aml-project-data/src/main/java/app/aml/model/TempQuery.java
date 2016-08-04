package app.aml.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the temp_query database table.
 * 
 */
@Entity
@Table(name="temp_query")
@NamedQuery(name="TempQuery.findAll", query="SELECT t FROM TempQuery t")
public class TempQuery implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@Column(length=250)
	private String nombres;

	public TempQuery() {
	}
	
	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

}