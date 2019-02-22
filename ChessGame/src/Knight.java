
public class Knight extends Piece {
	public static final int id = 2;
	public Knight(int x, int y, int p) {
		super(2, "K", x, y, p, id);
	}
	@Override
	public boolean isValidMove(int x, int y) {
			return(this.isKnightValid(x,y) && (Game.getPiece(x,y) == null || Game.getPiece(x,y).getPlayer() != this.player));
	}
}
