package co.prueba.konecta.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitudDto {
	
	@JsonProperty("id")
	private Long id;
	@JsonProperty("codigo")
	private int codigo;
	@JsonProperty("descripcion")
	private String descripcion;
	@JsonProperty("resumen")
	private String resumen;
	@JsonProperty("name")
	private String nameObrero;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the nameObrero
	 */
	public String getNameObrero() {
		return nameObrero;
	}
	/**
	 * @param nameObrero the nameObrero to set
	 */
	public void setNameObrero(String nameObrero) {
		this.nameObrero = nameObrero;
	}
	
	
}
