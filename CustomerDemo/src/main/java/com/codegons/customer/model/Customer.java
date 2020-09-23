package com.codegons.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "customer")
public class Customer {
	@Id
	 @Getter @Setter private int id;
	 @Getter @Setter private String name;
	 @Getter @Setter private String type;
	 @Getter @Setter private String value;

}