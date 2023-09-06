package com.ecom.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique = true,nullable = false)
	@NotNull
	@Size(min=5,max=15,message = "character must between 5-15 characters")
	private String name;
	
	@Column(unique = true,nullable = false)
	@NotNull
	@Size(min=5,max=15,message = "character must between 5-15 characters")
	private String city;
	
	@Column(unique = true,nullable = false)
	@NotNull
	@Size(min=6,max=6,message = "pincode having 6 digits")
	private String pincode;
	

}

