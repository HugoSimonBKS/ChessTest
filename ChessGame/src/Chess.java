
public class Chess {
	public static void main(String args[]) {
		Board b1 = new Board();
		System.out.println(Game.getPiece(1, 1));
		Game.getPiece(1, 1).move(3, 1);
		System.out.println(b1);
		Game.getPiece(3, 1).move(4, 1);
		System.out.println(b1);
		Game.getPiece(4, 1).move(5, 1);
		System.out.println(b1);
		Game.getPiece(5, 1).move(6, 0);
		System.out.println(b1);		
		Game.getPiece(6, 0).move(7, 1);
		System.out.println(b1);
		Game.getPiece(0, 1).move(2,2);
		System.out.println(b1);
		ChessPwainAixai ecrandejeu = new ChessPwainAixai(b1);
	}
	
}
