import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		
		this.add(new game_panel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
