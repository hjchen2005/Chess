package com.gottaapp.chess;

import java.awt.*;
import java.awt.event.*;
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
		Image chessPiecesImage /*;
		chessPiecesImage */ = new ImageIcon ("pieces.png").getImage();
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
}
