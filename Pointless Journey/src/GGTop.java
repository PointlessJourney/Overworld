import java.awt.Color;
import java.awt.Graphics;

public class GGTop extends OverChar {
	static int count = 0;
	public GGTop(int x, int y, ID player) {
		super(x, y, player);
		velY = 3;
		velX = 3;
		
	}

	
	public void tick() {
		

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
			g.fillRect(x, y, 64, 64);
	}



}
