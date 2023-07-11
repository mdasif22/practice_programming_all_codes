import java.util.Scanner;

public class Tic_Tac_Toe_Game {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		
		for(int row=0;row<board.length;row++) {
			for(int col=0;col<board.length;col++) {
				board[row][col] = ' ';
			}
		}
		
		char player = 'X';
		boolean gameOver = false;
		Scanner sc = new Scanner(System.in);
		
		while(!gameOver) {
			 printBoard(board);
			 System.out.println("\nPlayer "+ player + " please enter: ");
			 int row = sc.nextInt();
			 int col = sc.nextInt();
			 
			 if(board[row][col] == ' ') {
				 board[row][col] = player;
				 gameOver = haveWon(board,player);
				 if(gameOver) {
					 System.out.println("\nPlayer "+ player + " has won!!!");
				 }
				 else {
					 if(player=='X')
						 player ='0';
					 else
						 player = 'X';
				 }
			 }
			 else {
				 System.out.println("\nInvlid move. Try again!!");
			 }
		}
		printBoard(board); 
	}
	
	public static void printBoard(char[][] board) {
		for(int row=0;row<board.length;row++) {
			for(int col=0;col<board.length;col++) {
				System.out.print(board[row][col] + " | ");
			}
			System.out.println();
		}
	}
	
	public static boolean haveWon(char[][] board, char player) {
		//check row
		for(int row=0;row<board.length;row++) {
			if(board[row][0]==player && board[row][1]==player && board[row][2]==player)
				return true;
		}
		
		//check col
		for(int col=0;col<board.length;col++) {
			if(board[0][col]==player && board[1][col]==player && board[2][col]==player)
				return true;
		}
		
		//first diagonal
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player) {
			return true;
		}
		//second diagonal
		if(board[0][2]==player && board[1][1]==player && board[2][0]==player) {
			return true;
		}
		
		return false;
	}
}
