package co.prueba.konecta.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Faber
 *
 */

@Entity
@Table(name = "solicitud")
public class Solicitud implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CODIGO")
	private int codigo;
	
	@Column(name = "DESCRIPCION")
	private String descricion;
	
	@Column(name = "RESUMEN")
	private String resumen;
	
	@JoinColumn(name = "ID_OBRERO")
	@ManyToOne
	private Obrero obrero;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descricion
	 */
	public String getDescricion() {
		return descricion;
	}

	/**
	 * @param descricion the descricion to set
	 */
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * @return the obrero
	 */
	public Obrero getObrero() {
		return obrero;
	}

	/**
	 * @param obrero the obrero to set
	 */
	public void setObrero(Obrero obrero) {
		this.obrero = obrero;
	}

	
	
	

}