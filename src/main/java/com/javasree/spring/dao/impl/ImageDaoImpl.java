package com.javasree.spring.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.javasree.spring.dao.ImageDAO;
import com.javasree.spring.model.MyImage;
import com.javasree.spring.model.PaperPattern;

@Repository
public class ImageDaoImpl implements ImageDAO{

	private static final Logger logger = LoggerFactory.getLogger(ImageDaoImpl.class);
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addImage(String imagePath) {
		Session session = this.sessionFactory.getCurrentSession();
		byte[] bFile ;
		
		FileInputStream inputStream = null;
		try{
			File imageFile = new File(imagePath);
			bFile = new byte[(int) imageFile.length()];
			inputStream = new FileInputStream(imageFile);
			inputStream.read(bFile);
			inputStream.close();
		}
		catch(Exception imageException){
			imageException.printStackTrace();
		}
		session.persist(imagePath);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MyImage> listImages() {
		Session session = this.sessionFactory.getCurrentSession();
		List<MyImage> imageList = session.createQuery("from MyImage").list();
		return imageList;
	}
	
	public MyImage getImageById(int imageId) {
		Session session = this.sessionFactory.getCurrentSession();		
		MyImage myImage = (MyImage) session.load(MyImage.class, imageId);
		
		return myImage;
	}

}
