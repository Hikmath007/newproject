package com.example.debitcreditproject.entity;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "PoItems")
public class PoItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="po_Itemid")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "Po_id")
	private PoEntity poid;

	@ManyToOne
	@JoinColumn(name = "material_code")
	private MaterialEntity poItemMaterial;
	

    @JoinColumn(name = "price")
    private Long price; 
	
	@Column(name="Quantity")
	private Long quantity;
	
	
	@OneToMany(mappedBy = "poitem")
	private List<GrnItem> grn_items;
	
	@OneToOne(mappedBy = "poitems")
    private RateEntity poItem;
	
}
