
public class Bishop extends Piece {
	public static final int id = 3;
	public Bishop(int x, int y, int p) {
		super(3, "B", x, y, p, id);
	}
	@Override
	public boolean isValidMove(int x, int y) {
		return(this.isCrossed(x,y) && (Game.getPiece(x,y) == null || Game.getPiece(x,y).getPlayer() != this.player));
	}
}
