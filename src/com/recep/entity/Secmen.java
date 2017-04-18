package com.recep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Secmen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String oyVerilenParti;
	
	public Secmen(){}
	
	public Secmen(String name, String oyVerilenParti) {
		this.name = name;
		this.oyVerilenParti = oyVerilenParti;
	}
	
	public Secmen(int id, String oyVerilenParti) {
		this.id = id;
		this.oyVerilenParti = oyVerilenParti;
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
	public String getOyVerilenParti() {
		return oyVerilenParti;
	}
	public void setOyVerilenParti(String oyVerilenParti) {
		this.oyVerilenParti = oyVerilenParti;
	}

	
	
}
