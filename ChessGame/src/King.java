
public class King extends Piece {
	public static final int id = 6;
	
	public King(int x, int y, int p) {
		super(1000, "R", x, y, p, id);
	}

	@Override
	public boolean isValidMove(int x, int y) {
		int dx = Math.abs(x-this.posx);
		int dy = Math.abs(y-this.posy);
		return (
					((this.isAligned(x,y) && dx <= 1 && dy <= 1) ||
					(this.isCrossed(x,y) && dx == 1 && dy == 1))
					&& (Game.getPiece(x,y) == null || Game.getPiece(x,y).getPlayer() != this.player)
				) ;
	}
}
