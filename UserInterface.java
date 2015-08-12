package com.gottaapp.chess;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
//import java.io.InputStream;
//import org.eclipse.swt.SWT;
import javax.swing.*;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener{
	static int x=0,y=0;
	@Override
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.yellow);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		g.setColor(Color.BLUE); // First layer, because it is drawn befre the purple Rect
		g.fillRect(x-20,y-20,40,40);
		g.setColor(new Color(190,81,225));// Purple
		g.fillRect(40, 20, 80, 50); // Second layer, on top of the blue one
		g.drawString("Me", x, y);
		
		/***** Image of Pieces insert*******/
		//InputStream inputImage = new InputStream("src/com/gottaapp/chess/Resource/pieces.png");
		
		Image chessPiecesImage = new ImageIcon ("src/com/gottaapp/chess/Resource/pieces.png").getImage();
		// Image type for PNG: http://www.coderanch.com/t/343666/GUI/java/bufferedimage-type-transparent-png
		BufferedImage chessPiecesImageBefore = new BufferedImage(chessPiecesImage.getWidth(this),chessPiecesImage.getHeight(this),BufferedImage.TYPE_INT_ARGB);
		chessPiecesImageBefore = toBufferedImage(chessPiecesImage);
		//BufferedImage chessPiecesImageResized = new BufferedImage();
		g.drawImage(chessPiecesImage,x,y,this);
	}
	@Override
	public void mouseMoved(MouseEvent e){
		x=e.getX();
		y=e.getY();
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e){}
	@Override
	public void mouseReleased(MouseEvent e){}
	@Override
	public void mouseClicked(MouseEvent e){
		x=e.getX();
		y=e.getY();
		repaint();
	}
	@Override
	public void mouseDragged(MouseEvent e){}
	@Override
	public void mouseEntered(MouseEvent e){}
	@Override
	public void mouseExited(MouseEvent e){}
	
	/**
	 * scale image
	 * 
	 * @param sbi image to scale
	 * @param imageType type of image
	 * @param dWidth width of destination image
	 * @param dHeight height of destination image
	 * @param fWidth x-factor for transformation / scaling
	 * @param fHeight y-factor for transformation / scaling
	 * @return scaled image
	 */
	public static BufferedImage scale(BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {
	    BufferedImage dbi = null;
	    if(sbi != null) {
	        dbi = new BufferedImage(dWidth, dHeight, imageType);
	        Graphics2D g = dbi.createGraphics();
	        AffineTransform at = AffineTransform.getScaleInstance(fWidth, fHeight);
	        g.drawRenderedImage(sbi, at);
	    }
	    return dbi;
	}
	
	/**
	 * Converts a given Image into a BufferedImage
	 *
	 * @param img The Image to be converted
	 * @return The converted BufferedImage
	 */
	public static BufferedImage toBufferedImage(Image img){
	    if (img instanceof BufferedImage){
	        return (BufferedImage) img;
	    }

	    // Create a buffered image with transparency
	    BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

	    // Draw the image on to the buffered image
	    Graphics2D bGr = bimage.createGraphics();
	    bGr.drawImage(img, 0, 0, null);
	    bGr.dispose();

	    // Return the buffered image
	    return bimage;
	}
}
