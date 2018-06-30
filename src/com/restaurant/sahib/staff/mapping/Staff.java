package com.restaurant.sahib.staff.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Person")
@Entity
public class Staff {
	@Id
	@Column(name = "id_person")
	@SequenceGenerator(name = "ref", sequenceName = "person_id_person_seq", allocationSize = 1)
	@GeneratedValue(generator = "ref", strategy = GenerationType.SEQUENCE)
	private Integer idPerson;

	@Column(name = "id_position")
	private Integer idPosition;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "id_position", referencedColumnName = "id_position", insertable = false, updatable = false)
	private Position position;

	public Staff() {
		super();

	}

	public Staff(Integer idPerson, Integer idPosition, String name) {
		this.idPerson = idPerson;
		this.idPosition = idPosition;
		this.name = name;
	}

	public Integer getIdPerson() {

		return idPerson;
	}

	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
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
