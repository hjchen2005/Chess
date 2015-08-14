package com.gottaapp.chess;

import java.util.*;
import javax.swing.*;

public class AlphaBetaChess //implements UserInterface{
{
	static String chessboard[][]={ 
		// lower caps and upper caps represent different sides
		// a/A represents king
		{"r","q","b","q","a"," ","k","r"},
		{"p","p","p","p"," ","p","p","p"},
		{" "," "," "," "," "," "," "," "},
		{" "," "," "," ","p"," "," "," "},
		{" ","b"," "," "," "," "," "," "},
		{" "," "," "," "," "," "," "," "},
		{"p","p","p"," ","p","p","p","p"},
		{"R","K","B","Q","A","B","K","R"},
		
	};
	
	static int pawnBoard[][]={
		{0,0,0,0,0,0,0,0},
		{50,50,50,50,50,50,50,50},
		{10,10,20,30,30,20,10,10},
		{5,5,10,25,25,10,5,5},
		{0,0,0,20,20,0,0,0},
		{5,-5,-10,0,0,-10,-5,5},
		//{,,,,,,,},
		//{,,,,,,,},
	};
	
	public static void main(String[] args){
		JFrame f = new JFrame("Chess"); // Title of the window
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Common mistake: http://stackoverflow.com/questions/8058128/jframe-issue-syntax-error-on-token-setdefaultcloseoperation
		UserInterface ui = new UserInterface();
		f.add(ui); // add UI to the main method
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	public static String possibleMoves(){
		return "";
	}
}
