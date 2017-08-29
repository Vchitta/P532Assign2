package com.breakout.core;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Recorder {

	BufferedImage bufImg;
    File outputFile;	
	public void recordFrame(JPanel panel) 
	{
		
		bufImg=new BufferedImage(panel.getSize().width, panel.getSize().height,BufferedImage.TYPE_INT_RGB);
		panel.paint(bufImg.createGraphics());
		saveFrame(bufImg);
		
	}
	
    public void saveFrame(BufferedImage bufImg) 
    {
        outputFile = new File("C:\\Users\\shubh\\OneDrive\\Documents\\Test.png");
    	try {
			ImageIO.write(bufImg,"png", outputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	
}
