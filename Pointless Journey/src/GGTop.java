import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

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
		int centerX = x + 6;
		int centerY = y + 17;
		int mouseY = MouseInfo.getPointerInfo().getLocation().y;
		int mouseX = MouseInfo.getPointerInfo().getLocation().x;
		

		double angle = Math.atan2(centerY - mouseY, centerX - mouseX);

		/*((Graphics2D)g).rotate(angle, centerX, centerY);*/
		Graphics2D g2d = (Graphics2D)g;
		AffineTransform transform = g2d.getTransform();

		g2d.rotate(angle, centerX, centerY);

		g.fillRect(x, y, 13, 34); // draw your rectangle

		g2d.setTransform(transform);
			
	}

}

