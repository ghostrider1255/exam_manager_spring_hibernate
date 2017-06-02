package com.javasree.spring.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class ImageTest 
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/rajuDB","raju","raju");
			PreparedStatement ps = con.prepareStatement("insert into imageTest(img_data,img_title) values(?,?)");
			ps.setString(2, "Testing Image");
			
			FileInputStream imageInputStream = new FileInputStream("C:\\Users\\emvsraj\\workspace\\DMigration\\spring-mvc-hibernate\\src\\main\\webapp\\resources\\images\\black_forest.jpeg");
			ps.setBinaryStream(1,imageInputStream , imageInputStream.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records updated");
			con.close();
			imageInputStream.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
