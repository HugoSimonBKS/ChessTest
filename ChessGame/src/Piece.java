
public abstract class Piece {
	//0 = white 1 = black
	public final int player;
	protected int value;
	protected String name;
	protected int posx;
	protected int posy;
	protected boolean hasntMoved = true;
	protected int id;
	
	public Piece(int val, String nom, int x, int y,int p, int ident){
		this.value = val;
		this.name = nom;
		this.posx = x;
		this.posy = y;
 		this.player = p;
 		this.id = ident;
	}
	
	public abstract boolean isValidMove(int x, int y);
	
	public boolean isAligned(int x, int y) {
		return(this.posx == x || this.posy == y);
	}
	
	
	public boolean isCrossed(int x, int y){
		int dx = this.posx - x;
		int dy = this.posy - y;
		return (Math.abs(dx*dy) == Math.abs(dx*dx));
	}
	
	public boolean isKnightValid(int x, int y) {
		int dx = Math.abs(this.posx - x);
		int dy = Math.abs(this.posy - y);
		return(dx+dy == 3 && dx < 3 && dy < 3);
	}
	
	public void move(int x, int y) {
		if(isValidMove(x,y)) {
			if(Board.board[x][y] != 0) {
				Game.eat(x,y, this.player);
			}
	
			Game.MovePiece(this.posx,this.posy,x,y);
			this.posx = x;
			this.posy = y;
			this.hasntMoved = false;
			System.out.println(this);
		}
	}
	public int getPlayer() {
		return this.player;
	}

	public int getValue() {
		return this.value;
	}
	
	public String toString() {
		return this.name;
	}
}
