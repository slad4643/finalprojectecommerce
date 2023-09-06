package com.ecom.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity


public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	
	@Column(unique = true,nullable = false)
	@NotNull
	@Size(min=5,max=15,message ="Product name must between 5 - 15 characters")
	private String name;
	
	@Min(value=0,message="min price must be zero")
	@Max(value=1000,message="max price must be 1000")
	@Column(nullable = false)
	@NotNull
	private double price;
	
	
	@Min(value=0,message="min quantity must be zero")
	@Max(value=500,message="max quantity must be 500")
	@Column(nullable=false)
	private int  quality;
	
	@OneToOne
	@JoinColumn(name="categorey_id")
	private categorey categorey;
	
	@OneToMany(mappedBy="product")
	private List<Website>websites;
	
	

}
