package obstacles;

public class Obstacle 
{
	public int trapX;
	public int trapY;
	public String description;
	public String name;

	public Obstacle(int trapX, int trapY, String description, String name) 
	{
		this.trapX = trapX;
		this.trapY = trapY;
		this.description = description;
		this.name = name;
		//this.wallexists = false;
	}
	
}
