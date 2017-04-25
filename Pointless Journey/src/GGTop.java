import java.awt.Color;
import java.awt.Graphics;

public class GGTop extends OverChar {
	static int count = 0;
	public GGTop(int x, int y, ID player) {
		super(x, y, player);
		
	}

	public void tick() {
		
		x += velX;
		y += velY;
	}
	
	public void render(Graphics g) {	// enter character picture and information here
		// TODO Auto-generated method stub
		if(id == ID.Player)
		{
			g.setColor(Color.WHITE);
		}
		else if (id == ID.Player2)
		{
			g.setColor(Color.RED);
		}
			g.fillOval(x, y, 25, 25);
	}
}
