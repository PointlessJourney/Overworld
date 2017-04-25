import java.awt.Color;
import java.awt.Graphics;

public class GGTop extends OverChar {
	static int count = 0;
	public GGTop(int x, int y, ID player) {
		super(x, y, player);
		
		velX = 2;
	}

	
	public void tick() {
		
		x += velX;

	}

	
	public void render(Graphics g) {	// enter character picture and information here
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 64, 64);
	}



}
