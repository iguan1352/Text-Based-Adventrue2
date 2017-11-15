package obstacles;


public class Wall extends Room
{

	public Wall(int x, int y,boolean wall)
	{
		super(x,y);
		//this.explored = false;
		
	}

	public void print()
	{
		if(this.wall)
		{
			System.out.print("[ W ]");
		}
		else //if(this.player)
		{
			System.out.print("[   ]");
		}
		/*else
		{
			System.out.print("[   ]");
		}*/
	}
	
}
