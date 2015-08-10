package com.gottaapp.chess;

import java.util.*;
import javax.swing.*;

public class AlphaBetaChess {
	
	static String chessboard[][]={
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
		//f.add(ui);
	}
}