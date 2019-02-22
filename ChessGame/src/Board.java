public class Board {
	public static final int length = 8;
	protected static int[][] board;
	
	public Board() {
		board = new int[length][length];
		for(int x = 0; x < length; x++) {
			for(int y = 0; y < length; y++) {
				if((y == 0 || y == length-1) && (x == length-1 || x == 0)) {
					board[x][y] = Tower.id;
				}
				else if (x == length - 2 || x == 1) {
					board[x][y] = Pawn.id;
				}
				else if ((y == 1 || y == length - 2) && (x == length-1 || x == 0)) {
					board[x][y] = Knight.id;
				}
				else if ((y == 2 || y == length - 3) && (x == length-1 || x == 0)) {
					board[x][y] = Bishop.id;
				}
				else if (y == 3 &&  (x == length-1 || x == 0)) {
					board[x][y] = Queen.id;
				}
				else if (y == 4 && (x == length-1 || x == 0)) {
					board[x][y] = King.id;
				}
				else{
					board[x][y] = 0;
				}
			}
		}
		Game.init();
	}
	
	public String toString() {
		String affichage = "\n----------------------------------------------------------------\n";
		
		for(int x = 0; x < length; x++) {
			for(int y = 0; y < length; y++) {
				if(Game.getPiece(x,y) != null)
					affichage += " | " + Game.getPiece(x, y)+ "\t";
				else
					affichage += " |  \t";
			}
			affichage += "| \n----------------------------------------------------------------\n";
		}
		return affichage;
	}
}

