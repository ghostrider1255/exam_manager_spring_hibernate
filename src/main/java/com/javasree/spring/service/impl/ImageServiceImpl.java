package com.javasree.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javasree.spring.dao.ImageDAO;
import com.javasree.spring.model.MyImage;
import com.javasree.spring.service.ImageService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageDAO imageDAO;
	
	public void setImageDAO(ImageDAO imageDAO) {
		this.imageDAO = imageDAO;
	}
	
	@Override
	@Transactional
	public void addImage(String imagePath) {
		this.imageDAO.addImage(imagePath);
		
	}
	
	@Override
	@Transactional
	public List<MyImage> listImages(){
		return imageDAO.listImages();
	}

	@Override
	@Transactional
	public MyImage getImageById(int imageId) {
		return this.imageDAO.getImageById(imageId);
	}
}
