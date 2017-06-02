package com.javasree.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imageTest")
public class MyImage 
{
	@Id
	@Column(name="img_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int img_id;
	private String img_title;
	private byte[] img_data;
	
	public int getImg_id() {
		return img_id;
	}
	public void setImg_id(int img_id) {
		this.img_id = img_id;
	}
	public String getImg_title() {
		return img_title;
	}
	public void setImg_title(String img_title) {
		this.img_title = img_title;
	}
	public byte[] getImg_data() {
		return img_data;
	}
	public void setImg_data(byte[] img_data) {
		this.img_data = img_data;
	}
}
