package com.bridgelabz.tictactoe;

public class TicTacToe {
	
	public char[] board= new char[10];
	
	public void initializeBoard() {
		for(int index = 1;index<10;index++) {
			board[index] = ' ';
		}
	}
	
	public static void main(String[] args) {
		
	}

}
