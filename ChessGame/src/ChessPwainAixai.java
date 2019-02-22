import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.RootPaneContainer;


public class ChessPwainAixai extends JFrame {
	protected JTextArea invitdecomand;
	protected JTextArea log;
	protected JTextArea affichage;
	Font Console = new Font("Console",Font.PLAIN,27);
	Font scrlog = new Font("scrlog", Font.PLAIN, 14);
	
	public ChessPwainAixai(Board b2) {
		super("ChessPwainAixai");
		init(b2);
		this.setBounds(0, 0, 1500, 1000);
		this.setVisible(true);		
	}
	
	private void init(Board b) {
		this.setLayout(new BorderLayout());
		this.setFocusable(true);
		this.requestFocus();
		this.add(cmd(), BorderLayout.SOUTH);
		this.add(scr(b), BorderLayout.CENTER);
		this.add(log(), BorderLayout.EAST);
//		this.refresh();
	}
	private JPanel cmd() {
		JPanel comand = new JPanel();
		invitdecomand = new JTextArea(8,40);
		invitdecomand.setFont(Console);
		invitdecomand.setBackground(Color.BLACK);
		invitdecomand.setForeground(Color.WHITE);
		comand.add(invitdecomand);
		return comand;
	}
	private JPanel log(){
		JPanel conslog = new JPanel();
		JLabel gameState = new JLabel("<html>Points des blancs : " + Game.whitePoints + "<br><br> Pieces restantes : " + Game.piecesRest(0) + "<br><br>Points des noirs : " + Game.blackPoints + "<br><br> Pieces restantes : " + Game.piecesRest(1) + "<html>" );
		conslog.add(gameState);
		return conslog;
	}

	public void paintComponent(Graphics g) {
       
	} 
	
	private JPanel scr(Board b1) {

		JPanel aycran = new JPanel(); 
		affichage = new JTextArea(40,80);
		affichage.setFont(scrlog);
		affichage.setBackground(Color.BLACK);
		affichage.setForeground(Color.WHITE);
		affichage.setText(b1.toString());
		aycran.add(affichage);
		return aycran;
	}
}
