import java.awt.Color;
import java.awt.Graphics;

public class GGTop extends OverChar {

	public GGTop(int x, int y, ID player) {
		super(x, y, player);
		// TODO Auto-generated constructor stub
	}

	
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	
	public void render(Graphics g) {	// enter character picture and information here
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 64, 64);
	}



}
