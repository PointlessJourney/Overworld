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
			int speed = 5;
			int back = speed*-1;
			if (temp.getID() == ID.Player)
			{		//player movement keys
				if (key == KeyEvent.VK_W)temp.setVelY(back);
				if (key == KeyEvent.VK_S)temp.setVelY(speed);
				if (key == KeyEvent.VK_A)temp.setVelX(back);		
				if (key == KeyEvent.VK_D) temp.setVelX(speed);
				
			}
		}		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		for (int i = 0; i < handler.object.size(); i++)
		{
			OverChar temp = handler.object.get(i);
			
			if (temp.getID() == ID.Player)
			{		//player movement keys
				if (key == KeyEvent.VK_W)temp.setVelY(0);
				if (key == KeyEvent.VK_S)temp.setVelY(0);
				if (key == KeyEvent.VK_A)temp.setVelX(0);		
				if (key == KeyEvent.VK_D) temp.setVelX(0);	
			}
		}				
	}

}