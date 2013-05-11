
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TomekSolver {

	private static BufferedReader bufferedDataFile;
	private static String line;
	String newline = System.getProperty("line.separator");
	static String[][] board = new String[4][4];
	
	//returns numSymbols plus T
	public static int countHorizontal(String symbol, int row){
		int count = 0;
		for(int i = 0; i < 4; i++){
			if(board[row][i].equals(symbol) || board[row][i].equals("T")){
				count++;
			}
		}
		return count;
	}
	
	public static int countVertical(String symbol, int col){
		int count = 0;
		for(int i = 0; i < 4; i++){
			if(board[i][col].equals(symbol) || board[i][col].equals("T")){
				count++;
			}
		}
		return count;
	}
	
	public static boolean isFilled(String[][] board){
		for(int i = 0;i < 4;i++){
			for(int j = 0; j < 4; j++){
				//System.out.print(board[i][j]);
				if(board[i][j].equals(".")){
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static int countDiagonals(String symbol){
		
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < 4;i++){
			if(board[i][i].equals(symbol) || board[i][i].equals("T")){
				count1++; //left downwards diagonal
			}
			if(board[i][3-i].equals(symbol) || board[i][3-i].equals("T")){
				count2++; //right upwards diagonal
			}
		}
		
		return Math.max(count1,count2);
		
	}
	
	
	public static void main(String[] args) {

		
		//String filename = args[0];
			
		String filename = "A-large.in";

		
		FileReader dataFile;
		try {
			dataFile = new FileReader(filename);
			bufferedDataFile = new BufferedReader(dataFile);
			final int numBoards = Integer.parseInt(bufferedDataFile.readLine());
			
			//if there is a row, column or a diagonal containing 4 of that player's symbols, 
			//or containing 3 of her symbols and the 'T' symbol, she wins and the game ends. 
			
			for(int j = 0; j < numBoards; j++){
			for(int i = 0 ; i< 4;i++){
				line = bufferedDataFile.readLine();
				for(int k = 0; k < line.length();k++){
					board[i][k] = line.substring(k,k+1);
				}
				//System.out.println(line);
			}
			
			int maxXHorizontal = 0;
			for(int i=0;i<4;i++){
				maxXHorizontal = Math.max(maxXHorizontal,countHorizontal("X",i));
			}
			
			int maxOHorizontal = 0;
			for(int i=0;i<4;i++){
				maxOHorizontal = Math.max(maxOHorizontal,countHorizontal("O",i));
			}
			
			int maxXVertical = 0;
			for(int i=0;i<4;i++){
				maxXVertical = Math.max(maxXVertical,countVertical("X",i));
			}
			
			int maxOVertical = 0;
			for(int i=0;i<4;i++){
				maxOVertical = Math.max(maxOVertical,countVertical("O",i));
			}
			
			int xDiagonals = countDiagonals("X");
			int oDiagonals = countDiagonals("O");
//			System.out.println("Max of X-Horizontals:" + maxXHorizontal);
//			System.out.println("Max of O-Horizontals:" + maxOHorizontal);
//			System.out.println("Max of X-Verticals:" + maxXVertical);
//			System.out.println("Max of O-Verticals:" + maxOVertical);
//			System.out.println("X-Diagonals:" + xDiagonals);
//			System.out.println("O-Diagonals:" + oDiagonals);
			
			
			//System.out.println("Board is filled?: " + isFilled(board));
			
			int maxX = Math.max(xDiagonals ,Math.max(maxXHorizontal,maxXVertical));
			int maxO = Math.max(oDiagonals ,Math.max(maxOHorizontal,maxOVertical));
			
//			System.out.println("Max X:" + maxX);
//			System.out.println("Max O:" + maxO);
			
			if(maxX == maxO && isFilled(board)){
				System.out.println("Case #" + (j+1) + ": Draw");
			} else if(maxX == 4){
				System.out.println("Case #" + (j+1) + ": X won");
			} else if(maxO == 4){
				System.out.println("Case #" + (j+1) + ": O won");
			} else {
				System.out.println("Case #" + (j+1) + ": Game has not completed");
			}
			
			line = bufferedDataFile.readLine(); //newline

			//System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("io exception!");
			e.printStackTrace();
		}
		

		
	}

}
