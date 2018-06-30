package com.restaurant.sahib.staff.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Position of a person in the restaurant
 * 
 * @author Anshdeep Singh
 *
 */
@Table
@Entity
public class Position {

	@Id
	@Column(name = "id_position")
	@SequenceGenerator(name = "ref", sequenceName = "position_id_position_seq", allocationSize = 1)
	@GeneratedValue(generator = "ref", strategy = GenerationType.SEQUENCE)
	private Integer idPosition;

	@Column(name = "name_position")
	private String name;

	public Position(Integer idPosition, String name) {
		super();
		this.idPosition = idPosition;
		this.name = name;
	}

	public Integer getIdPosition() {
		return idPosition;

	}

	public void setIdPosition(Integer idPosition) {
		this.idPosition = idPosition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
