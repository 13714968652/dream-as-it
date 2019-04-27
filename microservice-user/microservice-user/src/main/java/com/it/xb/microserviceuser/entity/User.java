package com.it.xb.microserviceuser.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8011851205141601720L;

	/**
	 * id主键
	 */
	@Id
	@Length(max = 64, min = 1)
	private String id;
	
	@Column
	@Length(max = 100, min = 1)
	private String name;
	
	@Column
	private Character sex;
	
	@Column
	private short age;
}
