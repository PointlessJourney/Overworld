import java.awt.Color;
import java.awt.Graphics;

public class GGTop extends OverChar {

	public GGTop(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	public void tick() {
		
	}

	public void render(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(x, y, 64, 64);
	}

}
