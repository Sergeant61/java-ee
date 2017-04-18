package com.recep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parti {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int oysayisi;
	
	public Parti(){}
	
	public Parti(String name,int oysayisi){
		
		this.name = name;
		this.oysayisi = oysayisi;
	}
	
	public Parti(int id,int oysayisi){
		
		this.id = id;
		this.oysayisi = oysayisi;
	}
	
	public Parti(int id, String name, int oysayisi){
		
		this.id = id;
		this.oysayisi = oysayisi;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOysayisi() {
		return oysayisi;
	}
	public void setOysayisi(int oysayisi) {
		this.oysayisi = oysayisi;
	}

	
	
	
}
