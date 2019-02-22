public final class Game {
	private static Piece[][] listePiece = new Piece[Board.length][Board.length];
	static int blackPoints = 0;
	static int whitePoints = 0;
	private Game() {
		
	}
	public static void init() {
		for(int x = 0; x < Board.length; x++) {
			for(int y = 0; y < Board.length; y++) {
				
				if(Board.board[x][y] == 0) {
					listePiece[x][y] = null;
				}
				
				if(Board.board[x][y] == Pawn.id) {
					if(x == Board.length - 2){
						listePiece[x][y] = new Pawn(x,y, 1);
					}
					else {
						listePiece[x][y] = new Pawn(x,y, 0);
					}
				}
				
				if(Board.board[x][y] == Knight.id) {
					if(x == Board.length-1){
						listePiece[x][y] = new Knight(x,y, 1);
					}
					else {
						listePiece[x][y] = new Knight(x,y, 0);
					}
				}
				
				if(Board.board[x][y] == Bishop.id) {
					if(x == Board.length-1){
						listePiece[x][y] = new Bishop(x,y, 1);
					}
					else {
						listePiece[x][y] = new Bishop(x,y, 0);
					}
				}
				
				if(Board.board[x][y] == Tower.id) {
					if(x == Board.length-1){
						listePiece[x][y] = new Tower(x,y, 1);
					}
					else {
						listePiece[x][y] = new Tower(x,y, 0);
					}
				}
				
				if(Board.board[x][y] == Queen.id) {
					if(x == Board.length-1){
						listePiece[x][y] = new Queen(x,y, 1);
					}
					else {
						listePiece[x][y] = new Queen(x,y, 0);
					}
				}
				
				if(Board.board[x][y] == King.id) {
					if(x == Board.length-1){
						listePiece[x][y] = new King(x,y, 1);
					}
					else {
						listePiece[x][y] = new King(x,y, 0);
					}
				}
			}
		}
	}
	
	public static void moveConv(String move) {
		if(move.length()>2) {
			
		}
		char xmove = move.charAt(0);
		char ymove = move.charAt(1);
		int x = ((int) xmove) - 64;
		int y = ((int) ymove) - 48;
		if(x < 0 || x > Board.length || y < 0 || y > Board.length) {
			
		}
	}
	public static Piece getPiece(int x, int y) {
		return listePiece[x][y];
	}
	
	public static void eat(int x, int y, int pthateat){
		addPoint(getPiece(x,y).getValue(), pthateat);
		listePiece[x][y] = null;
		
	}
	
	public static void addPoint(int points, int player) {
		if(player == 1) {
			blackPoints += points;
		}
		else {
			whitePoints += points;
		}
	}
	public static String piecesRest(int player){
		String rest = new String();
		int tower = 0;
		int bishop = 0;
		int knight = 0;
		int king = 0;
		int pawn = 0;
		int queen = 0;
		for(int x = 0; x < Board.length; x++){
			for(int y = 0; y < Board.length; y++){
				if(listePiece[x][y] != null && listePiece[x][y].getPlayer() == player){
					switch (listePiece[x][y].id)
					{
						case 1: pawn++;
							break;
						case 2: knight++;
							break;
						case 3: bishop++;
							break;
						case 4: tower++;
							break;
						case 5: queen++;
							break;
						case 6: king++;
							break;
					}
				}
			}
		}
		rest += pawn + " Pawns, " + knight + " Knights, " + bishop + " Bishops, " + tower + " Towers, " + queen + " Queen, " + king + " King";
		return rest;
	}
	
	public static void MovePiece(int posx, int posy, int x, int y) {
		Board.board[x][y] = Board.board[posx][posy];
		Board.board[posx][posy] = 0;
		listePiece[x][y] = listePiece[posx][posy];
		listePiece[posx][posy] = null;
		System.out.println(listePiece[posx][posy]);
	}
}
