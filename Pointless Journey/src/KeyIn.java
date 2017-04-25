import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyIn extends KeyAdapter {
	private Handler handler;
	
	public KeyIn (Handler handler){
		this.handler = handler;
	}
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for (int i = 0; i < handler.object.size(); i++)
		{
			OverChar temp = handler.object.get(i);
			
			if (temp.getID() == ID.Player){
				//player movement keys
				
				if (key == KeyEvent.VK_W)
				{
					temp.setY(temp.getY() - (temp.getVelY() + 1));
				}
				if (key == KeyEvent.VK_S)
				{
					temp.setY(temp.getY() + (temp.getVelY() + 1));
				}
				if (key == KeyEvent.VK_A)
				{
					temp.setX(temp.getX() - (temp.getVelX() + 1));
				}
				if (key == KeyEvent.VK_D)
				{
					temp.setX(temp.getX() + (temp.getVelX() + 1));
				}
			}
		}
		
		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		
		
		
	}

}
