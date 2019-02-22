
public class Tower extends Piece {
	public static final int id = 4;
	public Tower(int x, int y, int p) {
		super(4, "T", x, y, p, id);
	}
	@Override
	public boolean isValidMove(int x, int y) {
		return(this.isAligned(x, y)&& (Game.getPiece(x,y) == null || Game.getPiece(x,y).getPlayer() != this.player));
	}
}
