package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static Scanner scanner = new Scanner(System.in);
	public static char[] board= new char[10];
	public static char playerCharacter;
	public static char computerCharacter;

	public static void initializeBoard() {

		for(int index = 1;index<10;index++) {
			board[index] = ' ';
		}
	}
	public static void chooseCharacter() {
		System.out.print("Choose Player Character (X/O): ");
		String myChoice = scanner.nextLine();
		myChoice.toUpperCase();
		if(myChoice.equalsIgnoreCase("X")) {
			playerCharacter = 'X';
			computerCharacter='O';
		}

		else if(myChoice.equalsIgnoreCase("O")) {
			playerCharacter = 'O';
			computerCharacter='X';
		}
		else {
			System.out.println("Invalid Choice!");
		}	
	}
	public static void main(String[] args) {

		System.out.println("Welcome to Tic Tac Toe program: ");
		System.out.println();
		initializeBoard();
		chooseCharacter();

	}
}
