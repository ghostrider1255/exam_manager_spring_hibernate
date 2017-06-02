package com.javasree.spring.dao;

import java.util.List;

import com.javasree.spring.model.MyImage;

public interface ImageDAO {

	public void addImage(String imagePath);
	
	public List<MyImage> listImages();
	
	public MyImage getImageById(int imageId);
}
