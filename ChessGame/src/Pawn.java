
public class Pawn extends Piece {
	public static final int id = 1;
	public Pawn(int x, int y, int p) {
		super(1, "P", x, y, p, id);
	}

	@Override
	public boolean isValidMove(int x, int y) {
		System.out.println(x +"\t"+ y+"\t" + this.posx+"\t" + this.posy + "\t" + this.player);
		if (Game.getPiece(x,y) != null) {
			System.out.println(Game.getPiece(x,y).getPlayer());
		}
		return(
				(this.player == 0 && x == this.posx+1 && y== this.posy && Board.board[x][y] == 0) ||
				(this.player == 1 && x == this.posx-1 && y== this.posy && Board.board[x][y] == 0) ||
				(this.player == 0 && x == this.posx+1 && ((y== this.posy+1 || y == this.posy-1) && Board.board[x][y] != 0 && (Game.getPiece(x,y) == null || Game.getPiece(x,y).getPlayer() != this.player))) ||
				(this.player == 1 && x == this.posx-1 && ((y== this.posy+1 || y == this.posy-1) && Board.board[x][y] != 0 && (Game.getPiece(x,y) == null || Game.getPiece(x,y).getPlayer() != this.player))) ||
				(this.hasntMoved && this.player == 0 && x == this.posx+2 &&  y == this.posy  && Board.board[x][y] == 0) ||
				(this.hasntMoved && this.player == 1 && x == this.posx-2 && y== this.posy && Board.board[x][y] == 0)
		);
	}
}
