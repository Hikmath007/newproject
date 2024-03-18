package com.example.debitcreditproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class GrnEntity {
	@Id
	@Column(name = "grn_number", length = 15)
	private String grnNumber;
	
	@Column(name = "grn_date")
	private String grnDate;

}
