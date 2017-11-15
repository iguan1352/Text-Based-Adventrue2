package obstacles;

public class Room 
{
	private Obstacle obstacle;
	public boolean obstacleExist;
	private int x;
	private int y;
	
	public Room(int x, int y,Obstacle obstacle, boolean obstacleExist) 
	{
		this.x = x;
		this.y = y;
		this.obstacle = obstacle;
		this.obstacleExist = obstacleExist;
	}

	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	
	//public abstract void print();
	public void print()
	{
		if(this.wallexists)
		{
			System.out.print("[ W ]");
		}
		else //if(this.player)
		{
			System.out.print("[   ]");
		}

	}
}
