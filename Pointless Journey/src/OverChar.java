import java.awt.Graphics;

public abstract class OverChar
{
	public OverChar(int x, int y, OverChar id)
	{
		this.x = x;
		this.y = y;
		this.id = id;
	}
    protected int x, y, velX, velY;  
    protected OverChar id;
	public abstract void tick();
	public abstract void render(Graphics g);
    
    
    public void setX(int x)
	{
		this.x = x;
	}
	public int getX()
	{
		return x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getY()
	{
		return y;
	}
	public void setID(OverChar id)	{
		this.id = id;
	}
	public OverChar getID()
	{
		return id;
	}
	public void setVelX(int velX)
	{
		this.velX = velX;
	}
	public int getVelX()
	{
		return velX;
	}
	public void setVelY(int velY)
	{
		this.velY = velY;
	}
	public int getVelY()
	{
		return velY;
	}

}