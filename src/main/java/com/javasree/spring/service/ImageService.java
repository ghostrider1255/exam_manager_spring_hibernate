package com.javasree.spring.service;

import java.util.List;

import com.javasree.spring.model.MyImage;


public interface ImageService 
{
	public void addImage(String imagePath);
	
	public List<MyImage> listImages();
	
	public MyImage getImageById(int imageId);
}
