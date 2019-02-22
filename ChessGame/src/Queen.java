
public class Queen extends Piece {
	public static final int id = 5;
	public Queen(int x, int y, int p) {
		super(5, "Q", x, y, p, id);
	}
	@Override
	public boolean isValidMove(int x, int y) {
		return((this.isAligned(x, y) || this.isCrossed(x, y)) && (Game.getPiece(x,y) == null || Game.getPiece(x,y).getPlayer() != this.player));
	}
}
