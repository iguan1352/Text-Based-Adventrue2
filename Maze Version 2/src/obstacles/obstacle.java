package obstacles;



public class obstacle implements Room{
	
	private String obstacle;
	private int x;
	private int y;
	
	public obstacle(int obstacle, int x, int y)
	{
		if(obstacle ==0)
		{
			this.obstacle = "wall";
		}
		else if(obstacle == 1)
		{
			this.obstacle = "sinkhole";
		}
		else 
		{
			this.obstacle = "empty";
		}
	}
	
	public String returnObstacle()
	{
		return this.obstacle;
	}
	
	//public abstract void print();
}
